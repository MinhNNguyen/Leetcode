class Solution {
    
    // Keep track of number of zeros that we have counted. As we traverse the array, swap all non zero number to the left
    public void moveZeroes(int[] nums) {
        int numZeros = 0;
        for (int cur = 0; cur < nums.length; cur++) {
            if (nums[cur] == 0) {
                numZeros++;
            }
            else {
                if (numZeros > 0) {
                    nums[cur - numZeros] = nums[cur];
                    nums[cur] = 0;
                }
            }
        }
    }
}