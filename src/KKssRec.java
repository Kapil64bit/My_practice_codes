public class KKssRec {
    public static void main(String[] args) {
    int []arr = {7,5,0,3,2,6,9};
    int max = 0,r = arr.length-1,c = 0;
    kkSS(arr,r,c,max);
    for(int i:arr){
        System.out.print(i + " ");
    }


    }
    static void kkSS(int[]arr,int r,int c,int max){
        if(r == 0) return;
        if(c < r){
            if(arr[c] > arr[max]){
                kkSS(arr,r,c+1,c);
            }
            else{
                kkSS(arr,r,c+1,max);
            }
        }
        else{
            int temp = arr[r];
            arr[r] = arr[max];
            arr[max] = temp;
            kkSS(arr,r-1,0,0);
        }
    }

}
