class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int ans = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            res.append(ch);
            if (res.length() > k) {
                res.deleteCharAt(0);
            }
            int temp = Integer.parseInt(res.toString());
            if (temp == 0)
                continue;
            if (res.length() == k && num % temp == 0) {
                ans++;
            }
        }
        return ans;
    }
}