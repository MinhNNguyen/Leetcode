/*
 *  10/03/2017
 *  Problem 26. Remove Duplicates from Sorted Array
 *  Runtime O(n) Space O(1)
 */

public class P26 {
	class Solution {
	    public int removeDuplicates(int[] nums) {
	        int index = 0;
	        for (int i = 1; i < nums.length; i++) {
	            if ( nums[i] != nums[i - 1]){
	                index++;
	                if (index != i) {
	                    nums[index] = nums[i];
	                }
	            }
	        }
	        return nums.length == 0 ? index : index + 1;
	    }
	}
}
