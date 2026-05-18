class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int rem = 0;
        int len = Math.min(num1.length(), num2.length());
        int max = Math.max(num1.length(), num2.length());
        int x = num1.length();
        int y = num2.length();
        int j = max - 1;
        for (int i = len - 1; i >= 0; i--) {
            if (x > y) {
                int t = (num1.charAt(j--) - '0') + (num2.charAt(i) - '0');
                res.append((t + rem) % 10);
                rem = (t + rem) / 10;
            } else {
                int t = (num1.charAt(i) - '0') + (num2.charAt(j--) - '0');
                res.append((t + rem) % 10);
                rem = (t + rem) / 10;
            }
        }

        for (int i = max - len - 1; i >= 0; i--) {
            if (x > y) {
                int t = num1.charAt(i) - '0';
                res.append((t + rem) % 10);
                rem = (t + rem) / 10;
            } else {
                int t = num2.charAt(i) - '0';
                res.append((t + rem) % 10);
                rem = (t + rem) / 10;
            }
        }
        if (rem > 0) {
            res.append(rem);
        }

        return res.reverse().toString();
    }
}