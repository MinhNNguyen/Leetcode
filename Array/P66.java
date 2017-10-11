/*
 * @author Minh Nguyen
 * 66. Plus One
 * 10/11/2017
 * Traverse through the string, if it is finished add 1, return
 * Runtime: O(n) 
 * Space O(1) Worst case: O(n)
 */
public class P66 {
	class Solution {
	    public int[] plusOne(int[] digits) {
	        int len = digits.length;
	        for (int i = len - 1; i >= 0; i--) {
	            if (digits[i] != 9) {
	                digits[i] = digits[i] + 1;
	                return digits;
	            }
	            digits[i] = 0;
	        }
	        int[] newArray = new int[len + 1];
	        newArray[0] = 1;
	        return newArray;
	    }
	}
}
