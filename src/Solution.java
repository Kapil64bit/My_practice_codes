public class Solution {
    static int makeQualityArray(int []a) {
        int ans = 0;

        // Iterate through every element and increase 'ans' if we encounter an element which is not good.
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                // Current element doesn't have an even divisor.
                ans++;
            }
            else {
                while (a[i] % 2 == 0) {
                    a[i] /= 2;
                }
                if (a[i] == 1) {
                    // Current element is a power of 2 so it doesn't have an odd divisor.
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []a = {3,5,8,6,10,7};
        makeQualityArray(a);
    }
}