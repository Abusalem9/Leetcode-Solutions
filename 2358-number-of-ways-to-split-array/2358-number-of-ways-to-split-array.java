class Solution {
    public int waysToSplitArray(int[] nums) {

        long rightSum = 0L;
        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }

        int res = 0;
        long leftSum = 0L;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            if (leftSum >= rightSum) {
                res++;
            }
        }
        return res;
    }
}