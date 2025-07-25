class Solution {
    public int largestCombination(int[] candidates) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int cnt = 0;
            for (int candidate : candidates) {
                if ((candidate & (1 << i)) != 0)
                    cnt++;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
}