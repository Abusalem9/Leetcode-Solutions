class Solution {
    public String reversePrefix(String word, char ch) {

        Stack<Character> stack = new Stack();
        int left = 0;
        for (int i = 0; i < word.length(); i++) {
            stack.add(word.charAt(i));
            if (word.charAt(i) == ch) {
                left = i;
                break;
            }
        }

        StringBuilder res = new StringBuilder();

        while (!stack.isEmpty() && left > 0) {
            res.append(stack.pop());
        }
        if (left > 0)
            left++;
        while (left < word.length()) {
            res.append(word.charAt(left++));
        }

        return res.toString();
    }
}