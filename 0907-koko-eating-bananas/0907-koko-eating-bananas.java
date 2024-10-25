class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int left = 1;
        int right = max;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int sum = 0;

            for (int j = 0; j < piles.length; j++) {
                sum += Math.ceil((double) piles[j] / (double) mid);
            }

            if (sum > h) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}