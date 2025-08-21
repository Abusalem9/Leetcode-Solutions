class Solution {
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] arr = mat[i];
            for (int j = i; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[k] = mat[j][k] & arr[k];
                }

                int cp = 0;
                int cs = 0;

                for (int start = 0; start < arr.length; start++) {
                    if (arr[start] == 0) {
                        cp = 0;
                    } else {
                        cp++;
                        cs += cp;
                    }
                }

                count += cs;

            }
        }

        return count;
    }
}