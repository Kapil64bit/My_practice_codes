public class haysack {
    public static void main(String[] args) {
        String sack = "cocacola";
        String moto = "co";
        System.out.println(strStr(sack,moto));
    }
    public static int strStr(String haystack, String needle) {
        int result = -1;                                //intialize result to -1
        if(haystack.contains(needle)) {                 //check haystack contains needle or not
            int index = haystack.indexOf(needle);       // get the index of haystack
            result = index;                             // if "YES" , assign the index of needle to result
        }
        return result;                                      //if "NO", return -1
    }
}
