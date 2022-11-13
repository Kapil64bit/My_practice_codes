class BubbleSort{

    static void bubbleSort(int[] arr,int n,int s) {
     if(n==0) return;
     if(s < n){
         if(arr[s] > arr[s+1]){
             int temp = arr[s];
             arr[s] = arr[s+1];
             arr[s+1] = temp;
             bubbleSort(arr,n,s+1);
         }
         else{
             bubbleSort(arr,n,s+1);
         }
     }
     else{
         bubbleSort(arr,n-1,0);
     }
    }
    public static void main(String[] args) {
        int []arr = {7,11,2,7,9,4,0};
        int n = arr.length-1;


        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr,n,0);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
       for(int i:arr) System.out.print(i + " ");

    }
}