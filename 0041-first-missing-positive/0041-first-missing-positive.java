class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        // Add only numbers in the range [1, n]
        for (int num : nums) {
            if (num > 0 && num <= n) {
                set.add(num);
            }
        }

        // Check for the first missing positive number
        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 1; // This line is redundant but kept for clarity
    }
}
