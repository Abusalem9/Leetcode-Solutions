class Solution {
    public int maxScoreSightseeingPair(int[] values) {

        int max = 0;
        int cur_max = values[0] - 1;
        for (int i = 1; i < values.length; i++) {
            max = Math.max(max, cur_max + values[i]);
            cur_max = Math.max(cur_max - 1, values[i] - 1);
        }

        return max;
    }
}