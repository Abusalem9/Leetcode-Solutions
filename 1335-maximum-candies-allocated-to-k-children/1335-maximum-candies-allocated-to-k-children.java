class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 0;
        int right = 0;

        for (int num : candies) {
            right = Math.max(right, num);
        }

        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            long totalChildren = 0;

            for (int num : candies) {
                totalChildren += num / mid;
            }

            if (totalChildren >= k) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
