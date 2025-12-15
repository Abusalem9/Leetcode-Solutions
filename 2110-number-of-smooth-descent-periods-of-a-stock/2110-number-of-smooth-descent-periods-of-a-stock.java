class Solution {
    public long getDescentPeriods(int[] prices) {

        long count = 1;
        long sum = 1;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] - prices[i] == 1) {
                count++;
            } else {
                count = 1;
            }
            sum += count;
        }
        return sum;
    }
}