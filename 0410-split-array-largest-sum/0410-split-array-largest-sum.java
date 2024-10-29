class Solution {
    public int splitArray(int[] nums, int k) {

        int left = Arrays.stream(nums).max().getAsInt();

        int right = Arrays.stream(nums).sum();

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int count = 1;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {

                if (sum + nums[i] <= mid) {
                    sum += nums[i];
                } else {
                    count++;
                    sum = nums[i];
                }
            }

            if (count > k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}