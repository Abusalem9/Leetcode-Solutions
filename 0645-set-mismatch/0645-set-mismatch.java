class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        boolean[] t = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (t[nums[i] - 1]) {
                ans[0] = nums[i];
            } else {
                t[nums[i] - 1] = true;
            }
        }

        for (int i = 0; i < t.length; i++) {
            if (!t[i]) {
                ans[1] = i + 1;
                return ans;
            }
        }
        return ans;
    }
}