class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prev = nums[0];

        int[] result = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            result[i] = prev;
            prev = prev * nums[i];
        }

        prev = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            prev *= nums[i + 1];
            result[i] = prev * result[i];
        }

        result[0] = prev;

        return result;
    }
}