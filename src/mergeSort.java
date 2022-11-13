import java.util.Arrays;

class mergeSort{
    public static void main(String[] args) {
        int []arr = {10,-2,-45,98,0};
        System.out.println(Arrays.toString(arr));
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));



    }
//   static int[] mergeSort(int[] arrEx){
//        if(arrEx.length == 1) return arrEx;
//
//        int mid = arrEx.length/2;
//        int[] left = mergeSort(Arrays.copyOfRange(arrEx,0,mid));
//        int[] right = mergeSort(Arrays.copyOfRange(arrEx,mid,arrEx.length));
//
//        return merge(left,right);
//    }
//    private static int[] merge(int[] left, int[] right){
//        int i = 0,j = 0, k =0;
//        int[] mix = new int[left.length + right.length];
//        while(i < left.length && j < right.length){
//            if(left[i] < right[j]){
//                mix[k] = left[i];
//                i++;
//            }
//            else{
//                mix[k] = right[j];
//                j++;
//            }
//            k++;
//
//        }
//        while(i < left.length){
//            mix[k] = left[i];
//            i++;
//            k++;
//        }
//        while(j < right.length){
//            mix[k] = right[j];
//            j++;
//            k++;
//        }
//        return mix;
//
//    }
    static void mergeSortInPlace(int[] arrEx,int s,int e){
        if(e - s == 1) return;

        int mid = s + (e -s)/2;
        mergeSortInPlace(arrEx,s,mid);
        mergeSortInPlace(arrEx,mid,e);

         mergeInPlace(arrEx,s,mid,e);
    }
    private static void mergeInPlace(int[] arrEX,int s, int mid,int e){
        int[] mix = new int[e -s];

        int i = s,j = mid, k =0;

        while(i < mid && j < e){
            if(arrEX[i] < arrEX[j]){
                mix[k] = arrEX[i];
                i++;
            }
            else{
                mix[k] = arrEX[j];
                j++;
            }
            k++;

        }
        while(i < mid){
            mix[k] = arrEX[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arrEX[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arrEX[s+l] = mix[l];
        }

}
}