class Solution {
    public int climbStairs(int n) {
        n = n + 1;
        int lastPrev = 0;
        int prev = 1;

        for (int i = 2; i <= n; i++) {
            int curr = prev + lastPrev;
            lastPrev = prev;
            prev = curr;
        }

        return prev;
    }

    public int climbing(int n) {
        if (n < 2) {
            return n;
        }
        return climbing(n - 1) + climbing(n - 2);
    }
}