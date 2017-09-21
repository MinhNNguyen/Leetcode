/*
 *  09/18/2017
 *  Problem 680
 *  Runtime O(n) and space O(1)
 *  Using two index number start from two ends of the string, compare the character at two indexes with each other
 *  If a mismatch occurs once, return OR of two cases: delete left character once, delete right character once
 *  Continue to search if there is no mistmatch return true, else return false
 */

public class P680 {
	class Solution {
	    public boolean validPalindrome(String s) {
	        char[] chars = s.toCharArray();
	        int left = - 1, right = chars.length;
	        while ( ++left < --right)
	        {
	            if ( chars[left] != chars[right] )
	                return isPalindrome(chars, left, right + 1) || isPalindrome(chars, left - 1, right);
	        }
	        return true;
	    }
	    
	    public boolean isPalindrome(char[] chars, int left, int right)
	    {
	        while (++left < --right) {
	            if (chars[left] != chars[right])
	                return false;
	        }
	        return true;
	    }
	    
	}
}
