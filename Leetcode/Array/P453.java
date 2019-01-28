/*
 * @author Minh Nguyen
 * 453. Minimum Moves to Equal Array Elements
 * 10/17/2017
 * When n-1 number increments equal to 1 number decrements, then traverse through the string to find the smallest
 * Then find how many times the other number has to decrements to be equal to the smallest number
 * Runtime: O(n) 
 * Space O(1)
 */
public class P453 {
	class Solution {
	    public int minMoves(int[] nums) {
	        if ( nums.length <= 1)
	            return 0;
	        int min = nums[0];
	        for (int i = 1; i < nums.length; i++)
	            min = Math.min(min, nums[i]);
	        int res = 0;
	        for (int i: nums) {
	            res += (i - min);
	        }
	        return res;
	    }
	}
}
