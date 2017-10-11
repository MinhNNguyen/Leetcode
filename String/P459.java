/*
 *  10/06/2017
 *  Problem 459. Repeated Substring Pattern
 *  Runtime O(nlogn) 
 */
public class P459 {
	class Solution {
	    public boolean repeatedSubstringPattern(String s) {
	        int len = s.length();
	        for (int i = len / 2; i >= 1; i--) {
	            if ( len % i == 0 ) {
	                String subS = s.substring(0, i);
	                int num = len / i;
	                int j;
	                for ( j = 1; j < num; j++) {
	                    if (!subS.equals(s.substring(j*i, j*i + i))) break;
	                }
	                if ( j == num) return true;
	            }
	        }
	        return false;
	    }
	}
}
