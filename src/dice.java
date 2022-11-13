public class dice {
    public static void main(String[] args) {
        Dice("",3);
    }
    static void Dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i < 6 && i <= target ; i++) {
            Dice(p+i,target -i);
        }
    }
}
