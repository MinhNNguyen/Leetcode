class Solution {
  public int[][] generateMatrix(int n) {
      if ( n == 0)
          return null;
      
      int[][] matrix = new int[n][n];
      
      int colStart = 0;
      int colEnd = n - 1;
      int rowStart = 0;
      int rowEnd = n - 1;
      int num = 1;
      
      while ( rowStart <= rowEnd && colStart <= colEnd) {
          
          for (int col = colStart; col <= colEnd; col++) {
              matrix[rowStart][col] = num++;
          }
          rowStart++;
          
          for (int row = rowStart; row <= rowEnd; row++) {
              matrix[row][colEnd] = num++;
          }
          colEnd--;
          
          for (int col = colEnd; col >= colStart; col--) {
              matrix[rowEnd][col] = num++;
          }
          rowEnd--;
          
          for (int row = rowEnd; row >= rowStart; row--) {
              matrix[row][colStart] = num++;
          }
          colStart++;  
      }
      
      return matrix;
  }
}