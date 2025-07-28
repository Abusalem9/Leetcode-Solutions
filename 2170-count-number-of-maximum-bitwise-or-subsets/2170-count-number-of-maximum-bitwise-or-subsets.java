class Solution {
    public int countMaxOrSubsets(int[] nums) {

        int max = 0;
        int[] ans = {0};

        for (int i : nums) {
            max |= i;
        }

        call(nums, max, 0, 0, ans);

        return ans[0];
    }

    public void call(int[] nums, int max, int curr, int i, int[] ans) {
        if (i == nums.length) {
            if (curr == max) {
                ans[0]++;
            }
            return;
        }

        call(nums, max, curr, i + 1, ans);
        call(nums, max, curr | nums[i], i + 1, ans);

    }
}