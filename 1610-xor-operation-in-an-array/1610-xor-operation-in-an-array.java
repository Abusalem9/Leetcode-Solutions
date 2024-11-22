class Solution {
    public int xorOperation(int n, int start) {
        int[] ans = new int[n];
        int res = start;
        for (int i = 1; i < n; i++) {
            ans[i] = start + (2 * i);
            res ^= ans[i];
        }

        return res;
    }
}