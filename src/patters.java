import java.util.Scanner;

public class patters {
    public static void main(String[] args) {

pat(4,0);
    }
    private static void pat(int row ,int col){

        if(row == 0) return;

        if(col < row){

            pat(row,col+1);
            System.out.print("* ");
        }
        else{

            pat(row-1,0);
            System.out.println();
        }



    }


}
