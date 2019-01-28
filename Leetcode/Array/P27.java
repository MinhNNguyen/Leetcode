class Solution {
  // THe approach is to record number of val we see and swap any element that is not equal to the value we are looking
  // for to the right and return only the length the subarray of non-value element
  public int removeElement(int[] nums, int val) {
      int numVal = 0;
      for (int cur = 0; cur < nums.length; cur++) {
          if (nums[cur] == val) {
              numVal++;
          }
          else {
              if (numVal > 0) {
                  nums[cur - numVal] = nums[cur];
                  nums[cur] = val;
              }
          }
      }
      return nums.length - numVal;
  }
}