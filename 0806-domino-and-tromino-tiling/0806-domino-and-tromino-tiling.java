class Solution {
    public int numTilings(int n) {
        int MOD = 1_000_000_007;
        if (n <= 2) {
            return n;
        }
        long fp = 1L;
        long fc = 2L;
        long pc = 1L;
        for (int k = 3; k < n + 1; ++k) {
            long tmp = fc;
            fc = (fc + fp + 2 * pc) % MOD;
            pc = (pc + fp) % MOD;
            fp = tmp;
        }
        return (int) (fc);
    }
}