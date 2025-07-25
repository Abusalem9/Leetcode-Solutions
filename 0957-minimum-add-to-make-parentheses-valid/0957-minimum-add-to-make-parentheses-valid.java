class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ch == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.add(ch);
            }
        }

        return stack.size();
    }
}