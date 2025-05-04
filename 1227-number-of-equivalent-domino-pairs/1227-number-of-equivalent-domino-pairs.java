class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {

        int count = 0;
        for (int i = 0; i < dominoes.length; i++) {
            int a = dominoes[i][0];
            int b = dominoes[i][1];
            for (int j = i + 1; j < dominoes.length; j++) {
                if ((dominoes[j][0] == a && dominoes[j][1] == b) || (dominoes[j][0] == b && dominoes[j][1] == a)) {
                    count++;
                }
            }
        }

        return count;
    }
}