class Solution {


  // Brute force: finding the smallest element from the end of the array since it is rotated
  // Time complexity: O(n)
  public int findMin1(int[] nums) {   
      for (int i = nums.length - 1; i >= 1; i--) {
          if (nums[i] < nums[i - 1])
              return nums[i];
      }
      return nums[0];
  }

  // Using binary search. Only the difference to compare the mid value to the low value to see
  // if the rotated point is to the left or to the right of the mid value. If it is to the right
  // then mid value would be bigger than low, otherwise it is to the left.
  // Compare mid to mid - 1 and mid + 1 to find out the lowest number
  public int findMin(int[] nums) {              
    // Corner case
    if ( nums.length == 1)
        return nums[0];
    
    int low = 0;
    int high = nums.length -1;
    
            
    // If array is not rotated 
    if (nums[high] > nums[low])
        return nums[low];

    while ( low < high ) {
        int mid = (low + high) / 2;
        if ( nums[mid] > nums[mid +1] ) {
            return nums[mid + 1];
        }
        if ( nums[mid] < nums[mid -1]) {
            return nums[mid];
        }
        
        if ( nums[mid] > nums[low])
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}

  }
}