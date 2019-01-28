// Brute force: is to go down all possbiel road and find out the min
// Improvement: use dynamic programming from bottom up and return the minLength to go to the top of the triangle
// Use only 1D array of size h since the triangle is bigger at the bottom and we only need to the length the current level

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int h = triangle.size();
        int[] dp = new int[h];

        for (int i = 0; i <= h - 1; i++) {
          dp[i] = triangle.get(h - 1).get(i);
        }

        for (int level = h - 2; level >= 0; level--) {
          for (int i = 0; i <= level; i++) {
            dp[i] = triangle.get(level).get(i) + Math.min(dp[i], dp[i + 1]);
          }
        }
        return dp[0];
    }
}