class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] col = new HashSet[n];

        HashSet<Character>[] box = new HashSet[n];

        for (int i = 0; i < n; i++) {
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            box[i] = new HashSet<Character>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char ch = board[i][j];

                if (ch == '.') {
                    continue;
                }

                if (row[i].contains(ch)) {
                    return false;
                }
                row[i].add(ch);

                if (col[j].contains(ch)) {
                    return false;
                }
                col[j].add(ch);

                int index = (i / 3) * 3 + j / 3;
                if (box[index].contains(ch)) {
                    return false;
                }

                box[index].add(ch);

            }
        }

        return true;
    }
}