class Solution {
    public int countSquares(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int[][] visited = new int[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count += dfs(n, m, matrix, visited, i, j);
            }
        }

        return count;

    }

    public int dfs(int n, int m, int[][] matrix, int[][] visited, int i, int j) {
        if (i == n || j == m || matrix[i][j] == 0) {
            return 0;
        }

        if(visited[i][j] != 0){
            return visited[i][j];
        }

        visited[i][j] = 1
                + Math.min(dfs(n, m, matrix, visited, i + 1, j), Math.min(dfs(n, m, matrix, visited, i + 1, j + 1),
                        dfs(n, m, matrix, visited, i, j + 1)));

        return visited[i][j];                    
    }
}