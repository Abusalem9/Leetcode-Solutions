class Solution {
    public long minEnd(int n, int x) {
        long res = x;
        long remaining = n - 1;
        long position = 1;
        
        while (remaining != 0) {
            if ((x & position) == 0) {
                res |= (remaining & 1) * position;
                remaining >>= 1;
            }
            position <<= 1;
        }
        
        return res;
    }
}