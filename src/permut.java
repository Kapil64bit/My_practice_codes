import java.util.ArrayList;
import java.util.List;

class permut {
    public static void main(String[] args) {
        System.out.println(pt("","abc").toString());
    }
//    static void pt(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char centre = up.charAt(0);
//
//        for (int i = 0; i <= p.length() ; i++) {
//            String leftPart = p.substring(0,i);
//            String rightPart = p.substring(i,p.length());
//            pt(leftPart + centre + rightPart , up.substring(1));
//        }
//
//    }

    static ArrayList<String> pt(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char centre = up.charAt(0);
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i <= p.length() ; i++) {
            String leftPart = p.substring(0,i);
            String rightPart = p.substring(i,p.length());

             res.addAll(pt(leftPart + centre + rightPart , up.substring(1)));


        }
      return res;
    }
}