import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
         int[] arr = {1,2,4,5,6,5,8,5,3,5};
        System.out.println(lserch(arr,5,0));
    }
    static ArrayList<Integer> lserch(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length) return list;

        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = lserch(arr,target,index+1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}
