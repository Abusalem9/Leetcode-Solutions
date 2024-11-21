class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        int[][] grid = new int[m][n];

        for(int[] g : guards){
            grid[g[0]][g[1]] = 2;
        }

        for(int[] w : walls){
           grid[w[0]][w[1]] = 2; 
        }

        int[] direction = {-1,0,1,0,-1};

        for(int[] g : guards){

            for(int i = 0; i < 4 ; ++i){
                int x = g[0], y = g[1];
                int dx = direction[i] , dy = direction[i +1];

                while(x + dx >= 0 && x + dx < m && y + dy >= 0 && y + dy < n && grid[x + dx][y + dy] < 2){
                    x +=dx;
                    y += dy;
                    grid[x][y] = 1;
                }
            }
        }

        int countBlocked = 0;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 0){
                    countBlocked++;
                }
            }
        }

        return countBlocked;
    }
}