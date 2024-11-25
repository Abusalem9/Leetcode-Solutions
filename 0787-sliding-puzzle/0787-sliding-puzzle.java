class Solution {
    public int slidingPuzzle(int[][] board) {
        String target = "123450";
        StringBuilder startBuilder = new StringBuilder();
        for (int[] row : board) {
            for (int num : row) {
                startBuilder.append(num);
            }
        }
        String start = startBuilder.toString();

        HashSet<String> visited = new HashSet<>();
        int[][] dirs = { { 1, 3 }, { 0, 2, 4 }, { 1, 5 }, { 0, 4 }, { 1, 3, 5 }, { 2, 4 } };
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                if (cur.equals(target)) {
                    return moves;
                }

                int zero = cur.indexOf('0');
                for (int dir : dirs[zero]) {
                    char[] nextState = cur.toCharArray();
                    swap(nextState, zero, dir);
                    String next = new String(nextState);

                    if (visited.contains(next)) {
                        continue;
                    }
                    visited.add(next);
                    queue.offer(next);
                }
            }
            moves++;
        }
        return -1;
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}