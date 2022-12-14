public class RabinKarp {
    public static void main(String[] args) {
        String sad = "mndsad";
        String needle = "sad";
        System.out.println(strStr(sad,needle));

    }

    public static int strStr(String haystack, String needle) {
        // We need a prime to minimize the chance of collisions, as in a HashMap.
        // The reason a prime is better is that when we generate hashcodes that are
        // multiples of each other, they don't land on the same bucket when we calculate
        // their mod (num_buckets) (unless they are multiples of the chosen prime).
        // As of where I got this from, I just searched for primes on Wikipedia ;)
        final int prime = 9999991;
        // Most people use a base here representative of the base the data is encoded in.
        // I have found 10 to be more intuitive and to work as fast as others,
        // at least for the leetcode test dataset.
        // Sedgewick uses 256, so feel free to switch to that, or to 26 if you restrict your values
        // to a-z.
        final int base = 10;

        // Handle cornercase: needle is empty
        if (needle.length() == 0) return 0;
        // Handle cornercase: needle is longer than haystack
        if (haystack.length() < needle.length()) return -1;

        // Since we are expressing the string in the hashcode as
        // char[i]*base^N + char[i-1] * base^N-1....+char[window.length()-1],
        // when we remove the most significant digit in each step a few lines down from here,
        // we need to multiply the letter we are removing from the window by the base elevated
        // to the number of digits in the window (char[i]*base^N) mod prime.
        // Needle (and the window) can have up to 50,000 characters as per requirements,
        // so this can go up to Math.pow(10, 50,000), which in Java just returns "Infinity" - it's a huge number.
        // To mitigate this, since we are going to be using this number to calculate a hash mod prime,
        // we can multiply the base n times and calculate its mod prime factor by factor.
        // This works because (a*b)%p = ((a%p)*(b%p))%p
        // (https://en.wikipedia.org/wiki/Modulo_operation#Properties_(identities))
        // Here we pre-calculate this number so we can reuse it, as we must do it iteratively
        // and it would consume cycles character by character otherwise.
        int maxBase = 1;
        for (int i = 1; i < needle.length(); i++) {
            maxBase = (maxBase * base) % prime;
        }

        int needlehash = hash(needle, needle.length(), base, prime);
        int haystackhash = hash(haystack, needle.length(), base, prime);

        // Did we get lucky with the first (needle.length()) characters?
        if (needlehash == haystackhash) return 0;

        // This loop slides the window of size needle.length() along the haystack.
        // For example for [a,b,c,d,...] and a needle of size 3,
        // it goes from [a,b,c] to [b,c,d] and so on.
        // At each step, it recalculates the window's hashcode in O(1), by reusing the previous result. This is the key of the algorithm.
        // For more info, please check https://en.wikipedia.org/wiki/Rolling_hash
        for (int i = needle.length(); i < haystack.length(); i++) {
            // Take first char out of the hash. You may note here that instead of subtracting the value for the most significant
            // character directly from haystackhash, I'm subtracting it from haystackhash+prime. The reason is that, since I'm
            // subtracting 2 numbers mod prime, the result could easily become negative. To prevent this, we add prime as the result
            // should be the same (a%p = (a+p)%p) https://en.wikipedia.org/wiki/Modulo_operation#Properties_(identities)
            // since now the number on the left of the subtraction is larger than the number on the right, the result
            // cannot be negative.
            haystackhash = (haystackhash+prime - (maxBase*haystack.charAt(i-needle.length())%prime))%prime;

            // Shift to the left, add new char
            haystackhash = (haystackhash*base + haystack.charAt(i))%prime;

            // hashes matching can mean a match or a collision. Only way to tell one from the other
            // is to linearly verify if the match on hash is also a match character by character.
            if (needlehash == haystackhash && checkSolution(haystack, needle, i-needle.length()+1)) return i-needle.length()+1;
        }

        return -1;
    }

    // Calculates a hashcode similar to how java.lang.String does it.
    // We reimplement it here because we need control over what the prime and the base is.
    // Java uses base=31 and prime=Integer.MAX_VALUE (implicitly)
    private static int hash(String chars, int count, int base, int prime) {
        int hash = 0;
        for (int i = 0; i < count; i++) {
            char c = chars.charAt(i);
            hash = (hash * base + c) % prime;
        }

        return hash;
    }

    // Check solution linearly, fail fast on first character not matching
    private static boolean checkSolution(String haystack, String needle, int i) {
        // Many strings have the same hashcode, we need to check whether this is a collision
        for (int j = 0; j < needle.length(); j++) {
            if (haystack.charAt(j+i) != needle.charAt(j)) return false;
        }

        return true;
    }
}
