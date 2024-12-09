class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {

        int[] prefixSum = new int[nums.length];

        int count = 1;
        prefixSum[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            count++;
            if (nums[i] % 2 == nums[i + 1] % 2) {
                count = 1;
            }
            prefixSum[i + 1] = count;
        }

        boolean[] ans = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            if (prefixSum[end] >= end - start + 1) {
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }

        return ans;
    }
}