class Solution {
    public int maxDepth(String s) {

        Stack<Character> stack = new Stack();
        int count = 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
                if (count > 0)
                    count--;
            }

            if (s.charAt(i) == ')') {
                stack.pop();
                count++;
            }
            res = Math.max(res, count);
            if (stack.isEmpty()) {
                count = 0;
            }

        }

        return res;
    }
}