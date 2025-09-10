class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length; 
        boolean[][] know = new boolean[m][n + 1];
        for (int i = 0; i < m; i++) {
            for (int l : languages[i]) {
                know[i][l] = true;
            }
        }

        // people that need to be taught
        boolean[] need = new boolean[m];
        for (int[] f : friendships) {
            int a = f[0] - 1, b = f[1] - 1;
            boolean canTalk = false;
            for (int l = 1; l <= n; l++) {
                if (know[a][l] && know[b][l]) {
                    canTalk = true;
                    break;
                }
            }
            if (!canTalk) {
                need[a] = true;
                need[b] = true;
            }
        }

        // if nobody needs teaching
        boolean anyNeed = false;
        for (boolean b : need) {
            if (b) { anyNeed = true; break; }
        }
        if (!anyNeed) return 0;

        int ans = Integer.MAX_VALUE;
        for (int l = 1; l <= n; l++) {
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                if (need[i] && !know[i][l]) {
                    cnt++;
                }
            }
            ans = Math.min(ans, cnt);
        }

        return ans;
    }
}
