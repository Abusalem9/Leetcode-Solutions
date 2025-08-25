class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int row = 0;
        int col = 0;
        int m = mat.length;
        int n = mat[0].length;
        boolean flag = true;
        int i = 0;
        int[] ans = new int[m * n];

        while (row < m && col < n) {
            if (flag) {
                while(row > 0 && col < n - 1){
                    ans[i++] = mat[row--][col++];
                }
                ans[i++] = mat[row][col];
                if(col == n - 1){
                    row++;
                }
                else{
                    col++;
                }
                flag = false;
            }
            else{
                while(row < m - 1 && col > 0){
                    ans[i++] = mat[row++][col--];
                }
                ans[i++] = mat[row][col];
                if(row == m - 1){
                    col++;
                }
                else{
                    row++;
                }
                flag = true;
            }
        }

        return ans;
    }
}