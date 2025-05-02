class Solution {
    public int countNegatives(int[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {

            int left = 0;
            int right = grid[i].length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (grid[i][mid] >= 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            // System.out.println(left);
            count += Math.max(grid[i].length - left, 0);
        }

        return count;
    }
}