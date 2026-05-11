class Solution {
    public int numberOfMatches(int n) {
        int x = n;
        int ans = 0;

        while (x > 1) {
            int temp = x;
            x = x / 2;
            ans += x;
            x = temp - x;
        }

        return ans;
    }
}