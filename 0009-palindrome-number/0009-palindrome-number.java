class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int ans = 0;

        while (n > 0) {
            ans *= 10;
            ans += n % 10;
            n = n / 10;
        }

        return ans == x;
    }
}