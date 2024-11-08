class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        int partLen = part.length();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));

            if (stack.size() >= partLen) {
                boolean isMatch = true;
                for (int j = 0; j < partLen; j++) {
                    if (stack.get(stack.size() - partLen + j) != part.charAt(j)) {
                        isMatch = false;
                        break;
                    }
                }


                if (isMatch) {
                    for (int j = 0; j < partLen; j++) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for (Character c : stack) {
            res.append(c);
        }
        return res.toString();
    }
}
