class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 1 << 31 && divisor == -1)
            return (1 << 31) - 1;
        int dividendAbs = Math.abs(dividend), divisorAbs = Math.abs(divisor), res = 0;
        for (int x = 31; x >= 0; x--)
            if ((dividendAbs >>> x) - divisorAbs >= 0) {
                res += 1 << x;
                dividendAbs -= divisorAbs << x;
            }
        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
}