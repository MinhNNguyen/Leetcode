// 09/14/2017
// 152. Maximum Product Subarray
// Solution runtime: O(n) and space: O(1)



public class P152 {

    public static  int maxProduct(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        // Maximum value since the beginning
        int max = nums[0];
        // Current maximum value of the subarray include nums[i]
        int curHigh = nums[0];
        // Current minimum value of the subarray include nums[i]
        int curLow = nums[0];
        // Temporary variable to remember value of currentMax without changing it, prevents the miscalculation of curLow
        int tempMax;
        for ( int i = 1; i < nums.length; i++) {
            tempMax = Math.max(Math.max(curHigh * nums[i], curLow * nums[i]), nums[i]);
            curLow = Math.min(Math.min(curHigh * nums[i], curLow * nums[i]), nums[i]);
            curHigh = tempMax;
            max = curHigh > max ? curHigh : max;
        }
        return max;
    }
}
