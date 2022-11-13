import java.util.ArrayList;

public class subSequenceRec {
    public static void main(String[] args) {
//    zz("","abc");
//        ArrayList<String> result = subSeqRec("","abc");
//
//        System.out.println(result);
        zzascii("","abc");
    }
//    static void zz(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char x = up.charAt(0);
//
//        zz(p + x,up.substring(1));
//        zz(p,up.substring(1));
//    }

    static ArrayList<String> subSeqRec(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char x = up.charAt(0);
        ArrayList<String> left = subSeqRec(p+x,up.substring(1));
        ArrayList<String> right = subSeqRec(p,up.substring(1));

        left.addAll(right);
        return left;
    }
        static void zzascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char x = up.charAt(0);

        zzascii(p + x,up.substring(1));
        zzascii(p,up.substring(1));
        zzascii(p+(x+0),up.substring(1));
    }

}
