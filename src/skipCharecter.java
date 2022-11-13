public class skipCharecter {
    public static void main(String[] args) {
String name = "big app apple";

        System.out.println(sK(name));

    }
    static String sK(String str){
        if(str.length() == 0) return "";

        if(str.startsWith("app") && !str.startsWith("apple")){
           return sK(str.substring(3));

        }
        return str.charAt(0) + sK(str.substring(1));

    }
}
