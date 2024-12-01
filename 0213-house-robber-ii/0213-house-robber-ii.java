class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        return Math.max(helper(nums, 0, n - 1), helper(nums, 1, n));

    }

    int helper(int[] nums, int start, int end) {
        int rob1 = 0;
        int rob2 = 0;

        for (int i = start; i < end; i++) {
            int temp = rob2;
            rob2 = Math.max(rob2, nums[i] + rob1);
            rob1 = temp;
        }

        return rob2;
    }
}
