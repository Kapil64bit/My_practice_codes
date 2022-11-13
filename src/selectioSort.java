public class selectioSort {
    public static void main(String[] args) {
        int []arr = {6,0,7,3,1};
        SS(arr);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
    static void SS(int arr[]){
        int n = arr.length-1;
        for(int i = 0 ;i < n;i++){
            System.out.println(i);

            int l = n-i;
            int maxx = max(arr,l);

           if(maxx != l){
               int temp = arr[maxx];
               arr[maxx] = arr[l];
               arr[l] = temp;

           }
        }

    }
    static int max(int []arr,int l){
        int maxx = 0;
        for(int i = 1;i<=l;i++){
            if(arr[maxx] <= arr[i] ){
                maxx = i;
            }
        }
        return maxx;
    }
}
