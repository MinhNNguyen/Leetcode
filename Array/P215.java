import java.util.Arrays;

/*
 * @author Minh Nguyen
 * 215. Kth Largest Element in an Array
 * 10/11/2017
 * Traverse through the array, find out if any number is bigger than the kth biggest number, if there is, replace that into kth biggest number and sort again
 * Runtime: O(n) 
 * Space O(k)
 */
public class P215 {
	class Solution {
	    public int findKthLargest(int[] nums, int k) {
	        int len = nums.length;
	        int[] high = new int[k];
	        for (int i = 0; i < k; i++) {
	            high[i] = nums[i];
	        }
	        Arrays.sort(high);
	        for (int i = k; i < len; i++) {
	            if (nums[i] > high[0]) {
	                high[0] = nums[i];
	                Arrays.sort(high);
	            }
	        }
	        return high[0];
	    }
	}
}
