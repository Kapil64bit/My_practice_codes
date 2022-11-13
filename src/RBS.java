public class RBS {
    public static void main(String[] args) {
     int []arr = {6,7,8,1,2,3,4,5};
        System.out.println(bs(arr,6,0,5));
    }
    static int bs(int[] arr,int target , int s,int e){
       if(s > e ) return -1;

       int m = s + (e - s) / 2 ;

       if(target == arr[m]) return m;

       if(arr[s] <= arr[m]){
           if(target >= arr[s] && target <= arr[m]){
             return   bs(arr,target,s,m-1);
           }
           else{
             return  bs(arr,target,m+1,e);
           }
       }
       if(arr[m] <= arr[e]){
           if(target >= arr[m] && target <= arr[e]){
              return bs(arr,target,m+1,e);
           }



       }


        return bs(arr,target,s,m-1);

        
    }

}
