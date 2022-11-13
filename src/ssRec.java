public class ssRec {
    public static void main(String[] args) {
        int[] arr = {1,0,3,2,7,5,-9,78,45,-33};
        int l = arr.length-1;
        int s = 0;
        ss(arr,l,s);
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
    static void ss(int[] arr,int l,int s){
        if(s>l) return;

      int max =  max(arr,l);
      if(arr[max] != arr[l]){
          swap(arr,max,l);
          ss(arr,l-1,0);
      }
        ss(arr,l-1,0);


    }
    static int max(int []arr,int l){
        int max = 0;
        for(int i = 0;i<= l;i++){
            if(arr[max] < arr[i]) max = i;
        }
        return max;
    }
    static void swap(int []arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
