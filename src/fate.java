public class fate {
    public static int[] shuffle(int[] nums, int n) {
        for(int i = 0; i < n; i++){
            nums[i] += nums[n + i] * 10000;
        }

        for(int i = n - 1; i >= 0; i--){
            nums[2 * i + 1] = nums[i] / 10000;
            nums[2 * i] = nums[i] % 10000;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int n = (nums.length)/2;
        shuffle(nums,n);
    }
}
