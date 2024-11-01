class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack();

        for (String token : tokens) {
            if (token.equals("+")) {
                int right = stack.pop();
                int left = stack.pop();
                stack.add(left + right);
            } else if (token.equals("-")) {
                int right = stack.pop();
                int left = stack.pop();
                stack.add(left - right);
            } else if (token.equals("*")) {
                int right = stack.pop();
                int left = stack.pop();
                stack.add(left * right);
            } else if (token.equals("/")) {
                int right = stack.pop();
                int left = stack.pop();
                stack.add(left / right);
            } else {
                stack.add(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }
}