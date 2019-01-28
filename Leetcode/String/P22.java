/*
 *  09/23/2017
 *  Problem 12 Integer to Roman
 *  Runtime O(n * log(n))
 *  Using two integer to keep track the remaining number of left parentheses and right parentheses
 *  left need to be placed in the string
 */
import java.util.ArrayList;
import java.util.List;


public class P22 {
	class Solution {
	    public List<String> generateParenthesis(int n) {
	        List<String> result = new ArrayList<String>();
	        // initiate number of left parenthese and right parentheses left need to be filled
	        generateString(result, new String(), n, n); 
	        return result;
	    }
	    
	    public void generateString(List<String> result, String s, int left, int right) {
	        if (left == 0 && right == 0) // if there is no parentheses left remaning, add to return array
	            result.add(s);
	        else if (left == right) // if all the parentheses in the string is closed, we can only open new one
	            generateString(result, s + "(", left - 1, right);
	        else if (left == 0) // if all the left parentheses are used up, the only choice is to close them
	            generateString(result, s + ")", left, right - 1);
	        else { // it can either open a new parentheses by using the left or close the opening one by using the right
	            generateString(result, s + "(", left - 1, right);
	            generateString(result, s + ")", left, right - 1);
	        }
	    } 
	}
}
