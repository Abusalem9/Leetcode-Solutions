class Solution {
    public int maxFrequency(int[] nums, int k) {
        int res = 0;
        long total = 0;

        Arrays.sort(nums);

        for (int left = 0, right = 0; right < nums.length; ++right) {
            total += nums[right];

            while (total + k < (long) nums[right] * (right - left + 1)) {
                total -= nums[left];
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}