class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int sum = 0;
        sum += numBottles;
        int num = numBottles;
        while (num >= numExchange) {
            sum += num / numExchange;

            num = (num % numExchange) + (num / numExchange);
        }
        return sum;
    }
}