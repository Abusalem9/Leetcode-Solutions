class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder res = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    res.setCharAt(i, '*');
                }
            }
        }

        while (!stack.isEmpty()) {
            res.setCharAt(stack.pop(), '*');
        }

        return res.toString().replaceAll("\\*", "");
    }
}
