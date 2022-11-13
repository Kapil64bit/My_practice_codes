import java.util.ArrayList;

public class numberPad {
    public static void main(String[] args) {
        System.out.println(pad("","12").toString());
    }
    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = (int)(up.charAt(0) - '0' );
        ArrayList<String> res = new ArrayList<>();

        for (int i = (digit -1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            res.addAll(pad(p+ch,up.substring(1)));
        }
        return res;
    }
}
