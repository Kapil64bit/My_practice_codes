public class bubbleRecursion {
    public static void main(String[] args) {
        int []arr = {3,5,7,3,6,9,3};
        BS(arr,0,1);
        for(int i:arr){
            System.out.print(i);
        }
    }
   static void BS(int []arr,int i,int j){
        if( j == arr.length-1)  return;

       if (arr[i] > arr[j]){
           int temp = arr[j];
           arr[j] = arr[i];
           arr[i] = temp;
           BS(arr,i+1,j+1);
       }
       else{
           BS(arr,i+1,j+1);
       }


   }
}
