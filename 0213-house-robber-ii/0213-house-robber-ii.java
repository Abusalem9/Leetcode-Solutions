class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        return Math.max(helper(nums, 0, nums.length - 1), helper(nums, 1, nums.length));
    }

    public int helper(int[] nums, int k, int m) {
        int first = 0;
        int second = 0;

        for (int i = k; i < m; i++) {
            int temp = Math.max(nums[i] + first, second);
            first = second;
            second = temp;
        }

        return second;
    }
}