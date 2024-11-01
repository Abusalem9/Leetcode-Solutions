class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> first = new Stack();
        Stack<Character> second = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (!first.isEmpty() && s.charAt(i) == '#') {
                first.pop();
            } else if (s.charAt(i) != '#') {
                first.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!second.isEmpty() && t.charAt(i) == '#') {
                second.pop();
            } else if (t.charAt(i) != '#') {
                second.push(t.charAt(i));
            }
        }

        return first.equals(second);

    }
}