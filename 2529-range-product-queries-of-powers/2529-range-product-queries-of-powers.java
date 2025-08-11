class Solution {
    private static final int MOD = 1000000007;

    public int[] productQueries(int n, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                list.add(1 << i);
            }
        }
        int[] ans = new int[queries.length];
        int k = 0;
        for (int[] query : queries) {
            long prd = 1;
            for (int i = query[0]; i <= query[1]; i++) {
                prd = (prd * list.get(i)) % MOD;
            }
            ans[k++] = (int) prd;
        }
        return ans;
    }
}
