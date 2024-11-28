class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k = 1;
        int left = 0;
        int right = 0;

        int zeros = 0;

        int max = 0;

        while (right < nums.length) {
            if (nums[right] == 0)
                zeros++;

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            int len = right - left + 1;
            max = Math.max(max, len);
            right++;

        }

        return max;
    }
}