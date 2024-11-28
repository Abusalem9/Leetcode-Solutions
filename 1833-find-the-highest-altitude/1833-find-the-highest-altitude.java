class Solution {
    public int largestAltitude(int[] gain) {

        int max = -100;
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            max = Math.max(sum, max);
            sum += gain[i];
        }
        max = Math.max(sum, max);

        return max;
    }
}