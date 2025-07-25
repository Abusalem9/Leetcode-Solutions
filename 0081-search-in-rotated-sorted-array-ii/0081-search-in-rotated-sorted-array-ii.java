class Solution {
    public boolean search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if(nums[mid] == nums[left] && nums[mid] == nums[right]){
                left++;
                right--;
                continue;
            }
            
            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target <nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Otherwise, the right half must be sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
