import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = prices.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }
            prices[i] -= stack.isEmpty() ? 0 : stack.peek();
            stack.push(prices[i] + (stack.isEmpty() ? 0 : stack.peek()));
        }

        return prices;
    }
}
