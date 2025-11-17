class Solution {
    public boolean kLengthApart(int[] nums, int k) {
    int first = -1;
    
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == 1 && first == -1) {
        first = i;
      } else if(nums[i] == 1) {
        if(i-first-1 < k) return false;
        first = i;
      }
    }
  
    return true;
    }
}