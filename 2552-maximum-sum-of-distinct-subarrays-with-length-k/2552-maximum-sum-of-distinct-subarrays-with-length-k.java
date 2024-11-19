class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long res = 0;
        Map<Integer, Integer> count = new HashMap<>();
        long curSum = 0;

        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);

            if (i - l + 1 > k) {
                count.put(nums[l], count.get(nums[l]) - 1);
                if (count.get(nums[l]) == 0) {
                    count.remove(nums[l]);
                }
                curSum -= nums[l];
                l++;
            }

            if (count.size() == i - l + 1 && i - l + 1 == k) {
                res = Math.max(res, curSum);
            }
        }

        return res;
    }
}