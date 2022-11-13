public class longestPalindrome {
    public static void main(String[] args) {
        String s = "cbcb";
        System.out.println(longestPalindrome(s));

    }
    private static int lo = 0, maxLen =0;

    public static String longestPalindrome(String s) {
       if(s == null || s.length() == 0) return "";

       int start = 0;
       int end = 0;

        for (int i = 0; i < s.length(); i++) {
           int  len1 = maxFromMiddle(s,i,i);
           int len2 = maxFromMiddle(s,i,i+1);
           int len = Math.max(len1,len2);
           if(len > end - start){
               start = i - ((len -1)/2);
               end = i + (len/2);
           }

        }
        return s.substring(start,end + 1);

    }

    public static int maxFromMiddle(String s,int left,int right){
        if(s == null) return 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ){
             left--;
             right++;
        }
        return right - left - 1;
    }
}
