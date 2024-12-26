class Solution {
    int res = 0;
    public int findTargetSumWays(int[] nums, int target) {
        // int res = 0;
        helper(nums, target, 0, 0);
        return res;
    }

    public void helper(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (target == sum) {
                res = res + 1;
            }
            return;
        }

        helper(nums, target, index + 1, sum + nums[index]);
        helper(nums, target, index + 1, sum - nums[index]);
    }
}