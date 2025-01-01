class Solution {
    public int maxScore(String s) {

        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int zeros = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') {
                    zeros++;
                }
            }
            int ones = 0;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    ones++;
                }
            }

            max = Math.max(max, (ones + zeros));
        }
        return max;
    }
}