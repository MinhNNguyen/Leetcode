/*
 *  09/18/2017
 *  Problem 647. Palindromic Substrings
 *  Runtime O(nlogn)
 *  Iterate through the Char Array and at each index check the possibility of the palindrome being found
 */


public class P647 {
	class Solution {
	    int result = 0;
	    
	    public int countSubstrings(String s) {
	        char[] chars = s.toCharArray();
	        for ( int i = 0; i < s.length(); i++) {
	            sumPalindrome(i, i, chars);
	            sumPalindrome(i, i+1, chars);
	        }
	        return result;
	    }
	    
	    public void sumPalindrome( int left, int right, char[] chars ) {
	        if (left < 0 || right > chars.length -1 || chars[left] != chars[right])
	            return;
	        result++;
	        sumPalindrome(left - 1, right + 1, chars);
	    }
	    
	    
	    
	}
}
