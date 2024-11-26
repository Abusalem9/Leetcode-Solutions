class Solution {
    public int findChampion(int n, int[][] edges) {

        int[] incoming = new int[n];

        for (int[] edge : edges) {
            incoming[edge[1]]++;
        }

        int champ = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (incoming[i] == 0) {
                count++;
                champ = i;
            }
        }

        return count > 1 ? -1 : champ;
    }
}