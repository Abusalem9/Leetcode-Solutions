class Solution {
    public int maximumCount(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        int lower = left;
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return Math.max(lower, nums.length - right - 1);
    }
}