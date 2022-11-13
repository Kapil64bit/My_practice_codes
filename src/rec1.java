import java.util.*;
public class rec1 {

//    public static void toon(int n){
//        if(n>5) return;
//        System.out.println(n);
//        toon(n+1);
//    }
    public static void revToon(int n){
        if(n==0) return;
        System.out.println(n);
        revToon(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        Scanner billy = new Scanner(System.in);
        System.out.println("enter number n");
         int n = billy.nextInt();
         revToon(n);
    }

}
