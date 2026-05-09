class Solution {
    public int mirrorDistance(int n) {

        int x = n;
        int res = 0;

        while (x > 0) {
            res = res * 10 + (x % 10);
            x = x / 10;
        }

        return Math.abs(n - res);
    }
}