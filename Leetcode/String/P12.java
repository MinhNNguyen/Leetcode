/*
 *  09/23/2017
 *  Problem 12 Integer to Roman
 *  Runtime O(1)
 *  Separate into different cases based on the remainder of number divided by 1000, 100, 10
 */

public class P12 {
	class Solution {
	    public String intToRoman(int num) {
	        StringBuilder builder = new StringBuilder();
	        while(num >= 1000) {
	            num = num - 1000;
	            builder.append("M");
	        }
	        helper(builder, num % 1000 , 100, "C", "D", "M");
	        helper(builder, num % 100, 10, "X","L", "C");
	        helper(builder, num % 10, 1, "I","V", "X");
	        
	        return builder.toString();
	    }
	    
	    public void helper(StringBuilder builder, int rem, int div, String low, String middle, String high) {
	        int count = rem / div;
	        if (count > 8)
	            builder.append(low + high);
	        else if (count >= 5) {
	            builder.append(middle);
	            for (int i = 0; i < count - 5; i++) {
	                builder.append(low);
	            }
	        } else if ( count > 3) {
	            builder.append(low + middle);
	        } else {
	            for (int i = 0; i < count; i++) {
	                builder.append(low);
	            }
	        }
	    }
	}
}
