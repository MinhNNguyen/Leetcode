/**
 * 10/03/2017
 * 96. Unique Binary Search Trees
 * Runtime: O(nlogn)
 */
public class P96 {
	class Solution {
	    public int numTrees(int n) {
	        int[] nums = new int[n + 1];
	        nums[0] = 1;
	        nums[1] = 1;
	        for (int i = 2; i <= n; i++) {
	            for (int j = 0; j < (i+1) / 2; j++) {
	                if ( j == (i - 1) / 2 && (i - 1) % 2 == 0)
	                    nums[i] = nums[i] + nums[j] * nums[ i - 1 - j ];
	                else
	                    nums[i] = nums[i] + nums[j] * nums[ i - 1 - j ] * 2;
	            }
	        }
	        return nums[n];
	    }
	}
}
