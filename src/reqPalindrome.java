public class reqPalindrome {
    public static void main(String[] args) {
        System.out.println(solve("babb"));
    }
    public static int solve(String A) {
        int finalLen = 0;
        for(int i = (A.length()-1)/2;i>=0;i--){

            int len1 = isPalindrome(A,i,i);

            int len2 = isPalindrome(A,i-1,i);
            len2 = Math.max(len1,len2);

            finalLen = Math.max(finalLen,len2);

        }
        if(finalLen == 0 || finalLen == 1) return A.length()-1;
        if(finalLen == A.length()/2) return 0;

        else return A.length() - 2*(finalLen + 1);




    }

    public static int isPalindrome(String A,int i,int j){
        int count = 0;
        while(i>=0){
            if(A.charAt(i) == A.charAt(j)){
                count = count + 1;
                i--;
                j++;
                if(i< 0) return count;
            }
            else{
                count = 0;
                i--;
                j++;
                if(i< 0) return count;
            }

        }
        return count;
    }
}
