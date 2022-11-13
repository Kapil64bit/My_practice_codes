class subString2
{
    public static void main(String[] args) {
        System.out.println(rearrangeCharacters("leetcoodedoce","code"));
    }
    public static int rearrangeCharacters(String s, String target)
    {
        int[] freq = new int[26], freq2 = new int[26];
        for(char ch : s.toCharArray())

            freq[ch-'a']++;
        for(char ch : target.toCharArray()){

            freq2[ch - 'a']++;
            System.out.println(ch);
        }


        int min = Integer.MAX_VALUE;
        for(char ch : target.toCharArray())
            min = Math.min(min,freq[ch-'a']/freq2[ch-'a']);

        return min;
    }
}