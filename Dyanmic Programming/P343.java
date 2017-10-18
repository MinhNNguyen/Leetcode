/*
 * @author Minh Nguyen
 * 343. Integer Break
 * 10/16/2017
 * Using Dynamic programming to look for the maximize product of each number before divideing into smaller ones
 * Runtime: O(n * logn)
 */
public class P343 {
	class Solution {
	    int[] result;
	    
	    public int integerBreak(int n) {
	        result = new int[n + 1];
	        result[1] =  1;
	        for (int i = 2; i <= n; i++) {
	            int max = calculate(1, i - 1);
	            for (int j = 2; j <= i / 2; j++) {
	                max = Math.max(max, calculate(j, i - j));
	            }
	            result[i] = max;
	        }
	        return result[n];
	    }
	    
	    public int calculate(int num1, int num2) {
	        int r1 = result[num1];
	        int r2 = result[num2];
	        int max = num1 * num2;
	        max = Math.max(max, r1 * num2);
	        max = Math.max(max, r2 * num1);
	        max = Math.max(max, r1 * r2);
	        return max;
	    }
	}
}
