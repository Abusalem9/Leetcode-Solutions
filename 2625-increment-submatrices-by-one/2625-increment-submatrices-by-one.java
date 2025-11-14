class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        
        int[][] ans = new int[n][n];

        for(int i = 0 ; i < queries.length ; i++){
            int[] query = queries[i];

            for(int k = query[1]; k<= query[3]; k++){
                for(int j = query[0] ; j <= query[2] ; j++){
                    ans[j][k]++;
                }
            }
        }
        return ans;
    }
}