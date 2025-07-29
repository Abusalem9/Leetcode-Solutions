class Solution {
    public int maxProfit(int[] prices) {

        int i = 0;
        int j = 1;
        int n = prices.length;
        int ans = 0;

        while (j < n) {
            if (prices[i] < prices[j]) {
                int temp = prices[j] - prices[i];
                ans = Math.max(ans, temp);
            } else {
                i = j;
            }
            j++;
        }
        return ans;
    }
}