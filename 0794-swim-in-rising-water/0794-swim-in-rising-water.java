class Solution {
    public int swimInWater(int[][] grid) {

        int row = grid.length;
        int col = grid.length;

        boolean[][] visited = new boolean[row][col];

        PriorityQueue<Heap> queue = new PriorityQueue<>();
        queue.offer(new Heap(0, 0, grid[0][0]));

        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        while (!queue.isEmpty()) {
            Heap h = queue.poll();

            if (visited[h.x][h.y]) {
                continue;
            }

            if (h.x == row - 1 && h.y == col - 1) {
                return h.max;
            }

            visited[h.x][h.y] = true;

            for (int[] dir : dirs) {
                int newRow = h.x + dir[0];
                int newCol = h.y + dir[1];

                if (newRow < 0 || newRow >= row || newCol < 0 || newCol >= col || visited[newRow][newCol]) {
                    continue;
                }

                int newMax = Math.max(h.max, grid[newRow][newCol]);
                queue.offer(new Heap(newRow, newCol, newMax));
            }
        }
        return 0;
    }

    static class Heap implements Comparable<Heap> {
        int x;
        int y;
        int max;

        Heap(int x, int y, int max) {
            this.x = x;
            this.y = y;
            this.max = max;
        }

        @Override
        public int compareTo(Heap other) {
            return this.max - other.max;
        }
    }
}