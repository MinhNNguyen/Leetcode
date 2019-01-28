/**
 * 10/06/2017
 * 221. Maximal Square
 * Runtime: O(n)
 */
public class P221 {
	class Solution {
	    public int maximalSquare(char[][] matrix) {
	        if (matrix.length == 0) return 0;
	        int h = matrix.length; int w = matrix[0].length;
	        int [][] square = new int[h + 1][w + 1];
	        int max = 0;
	        for (int i = 1; i <= h; i++) {
	            for (int j = 1; j <= w; j++) {
	                if (matrix[i - 1][j - 1] == '1') {
	                    square[i][j] = Math.min(Math.min(square[i-1][j], square[i][j - 1]), square[i - 1][j - 1]) + 1;
	                    max = Math.max(max, square[i][j]);
	                }
	            }
	        }
	        return max * max;
	    }
	}
}
