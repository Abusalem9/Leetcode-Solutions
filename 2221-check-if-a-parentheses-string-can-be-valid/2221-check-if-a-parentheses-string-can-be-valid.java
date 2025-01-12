class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) {
            return false; // Odd-length strings can't be balanced
        }

        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> flexibleStack = new Stack<>();

        // First pass: Handle ')' from left to right
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0') {
                flexibleStack.push(i);
            } else if (s.charAt(i) == '(') {
                openStack.push(i);
            } else {
                if (!openStack.isEmpty()) {
                    openStack.pop();
                } else if (!flexibleStack.isEmpty()) {
                    flexibleStack.pop();
                } else {
                    return false; // Unmatched ')'
                }
            }
        }

        // Second pass: Handle '(' from right to left
        while (!openStack.isEmpty()) {
            if (flexibleStack.isEmpty() || flexibleStack.peek() < openStack.peek()) {
                return false; // No flexible position to balance '('
            }
            openStack.pop();
            flexibleStack.pop();
        }

        return true;
    }
}
