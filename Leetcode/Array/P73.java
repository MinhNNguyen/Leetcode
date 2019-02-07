class Solution {
    
  // Traverse the matrix for the first time, every 0 found we denoted the col and row responsively to be 0
  // Then we traverse the matrix again and replace 0 to every element that has row or col denoted.

  // Time Complexity: O(M * N) and Space Complexity O(M + N)

  public void setZeroes(int[][] matrix) {
      int numRow = matrix.length;
      if (numRow == 0)
          return;
      int numCol = matrix[0].length;

      boolean[] rows = new boolean[numRow];
      boolean[] cols = new boolean[numCol];
      
      for (int row = 0;  row < numRow; row++ ) {
          for (int col = 0; col < numCol; col++) {
              if ( matrix[row][col] == 0) {
                  rows[row] = true;
                  cols[col] = true;
              }
          }
      }
      
      for (int row = 0;  row < numRow; row++ ) {
          for (int col = 0; col < numCol; col++) {
              if ( rows[row] || cols[col])
                  matrix[row][col] = 0;
          }
      }
  }

  // Improved way of using only O(1) space is when we traverse through the matrix, with every 0 we found, we denoted
  // the first element of the col and the first element of the row matrix[0][j] and matrix[i][0] to be 0.
  
}