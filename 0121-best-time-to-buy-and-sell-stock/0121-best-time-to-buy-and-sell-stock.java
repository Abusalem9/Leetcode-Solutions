class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] - buy > profit){
                profit = prices[i] - buy;
            }

            if(buy > prices[i]){
                buy = prices[i];
            }
        }
        return profit;
    }
}