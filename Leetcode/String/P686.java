/*
 *  10/02/2017
 *  Problem 686. Repeated String Match
 *  Runtime O(n/m) 
 */
public class P686 {
	class Solution {
	    public int repeatedStringMatch(String A, String B) {
	        int lenA = A.length();
	        int lenB = B.length();
	        if (lenB == 0)
	            return 0;
	        if (lenA == 0)
	            return -1;
	        String s = A;
	        int count = 1;
	        while (s.length() < lenB ) {
	            s = s.concat(A);
	            count++;
	        }
	        if (s.contains(B))
	            return count;
	        s = s.concat(A);
	        if (s.contains(B))
	            return ++count;
	        return -1;
	    }
	}
}
