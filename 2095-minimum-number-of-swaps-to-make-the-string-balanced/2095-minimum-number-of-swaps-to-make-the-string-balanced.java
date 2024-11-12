class Solution {
    public int minSwaps(String s) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                count--;
            } else
                count++;
            max = Math.max(count, max);
        }

        return (max + 1) / 2;
    }
}