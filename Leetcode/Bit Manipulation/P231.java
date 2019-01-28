/*
 *  09/26/2017
 *  Problem 151 Reverse Words in a String
 *  Runtime O()
 *  Use bit manipulation to compare n and n - 1. If the and result of those two numbers is 0, then it is power of 2
 */

public class P231 {
	class Solution {
		public boolean isPowerOfTwo(int n) {
		    return ((n & (n-1))==0 && n>0);
		}
	}
}
