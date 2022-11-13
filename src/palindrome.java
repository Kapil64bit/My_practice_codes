public class palindrome {
    public static void main(String[] args) {
        int x = 55355;

        palindrome pal = new palindrome();
        pal.isPalindrome(x);
    }
    public  boolean isPalindrome(int x) {

        if (x < 0) return false;

        int p = x;
        int q = 0;

        while (p >= 10){
            q *=10;
            q += p%10;
            p /=10;
        }
        System.out.println(q == x / 10 && p == x % 10);

        return q == x / 10 && p == x % 10;

    }
}
