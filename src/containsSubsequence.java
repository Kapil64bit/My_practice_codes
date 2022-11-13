public class containsSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1,text2));

    }
    public static int longestCommonSubsequence(String text1, String text2) {
        if(text1.contains(text2)) return text2.length();
        else return 0;
    }
}
