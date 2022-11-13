import java.util.*;
class palindromeSubset {
    public static void main(String[] args) {
        partition("aab");
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ansList = new ArrayList<>();
        helper(ansList,new ArrayList<>(),s,0);
        return ansList;
    }
    public static void helper(List<List<String>> ansList,List<String> tl,String s,int ind){
        if(ind == s.length()){
            ansList.add(new ArrayList<>(tl));
        }
        else{
            for(int i = ind;i< s.length();i++){
                if(isPal(s,ind,i)){
                    tl.add(s.substring(ind,i+1));
                    helper(ansList,tl,s,i+1);
                    tl.remove(tl.size()-1);
                }
            }
        }
    }
    public static boolean isPal(String s,int low,int high){
        while(low < high){
            if(s.charAt(low++) != s.charAt(high--)) return false;


        }
        return true;

    }
}