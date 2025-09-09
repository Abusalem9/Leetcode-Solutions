class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1_000_000_007;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        long sharing = 0;

        for (int day = 2; day <= n; day++) {
        
            sharing = (sharing + dp[Math.max(0, day - delay)]) % MOD;

            if (day - forget > 0) {
                sharing = (sharing - dp[day - forget] + MOD) % MOD;
            }

            dp[day] = sharing;
        }

        long ans = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i >= 1) ans = (ans + dp[i]) % MOD;
        }

        return (int) ans;
    }
}
