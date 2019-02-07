class Solution {
    
  // Brute force: Using HashMap to denote every number from the range of 1 to nums.length.
  // Traverse through the array and noted any number the appears
  // Then go back to the HashMap and find the smallest number that does not show up
  // That way would be O(n) time complexity and O(n) space
  
  // We can sort swap and figure out the first number is not equal to its index
  public int firstMissingPositive(int[] nums) {
      int max = nums.length;
      int temp = 0;
      int posToSwap = -1;
      for (int i = 0; i < max; i++) {
          while ( nums[i] > 0 && nums[i] < max && nums[i] != (i + 1) && nums[i] != nums[nums[i] - 1] ) {
              posToSwap = nums[i] - 1;
              temp = nums[i];
              nums[i] = nums[ posToSwap ];
              nums[posToSwap] = temp;
          }
      }
      
      for (int i = 0; i < max; i++) {
          if (nums[i] != i + 1)
              return i + 1;
      }
      return max + 1;
  }
}