class Solution {
    public int[] orArray(int[] nums) {
        int[] ans = new int[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            ans[i - 1] = nums[i - 1] | nums[i];
        }

        return ans;
    }
}