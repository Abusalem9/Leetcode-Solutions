class Solution {
    public int[] resultsArray(int[] nums, int k) {

        if (nums == null || nums.length < k || k <= 0) {
            return new int[0];
        }

        int[] ans = new int[nums.length - k + 1];

        for (int i = 0; i <= nums.length - k; i++) {
            int max = Integer.MIN_VALUE;
            boolean isAscending = true;

            for (int j = i; j < i + k; j++) {
                if (j > i && (nums[j - 1] + 1) != nums[j]) {
                    isAscending = false;
                    break;
                }
                max = Math.max(max, nums[j]);
            }

            ans[i] = isAscending ? max : -1;
        }

        return ans;
    }
}
