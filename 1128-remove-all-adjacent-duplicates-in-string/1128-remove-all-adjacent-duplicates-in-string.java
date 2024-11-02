class Solution {
    public String removeDuplicates(String s) {

        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {

            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        return res.reverse().toString();
    }
}