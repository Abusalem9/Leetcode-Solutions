class Solution {
    public int maxChunksToSorted(int[] arr) {

        int n = arr.length;

        int[] prefixMax = arr.clone();
        int[] suffixMin = arr.clone();

        for (int i = 1; i < n - 1; i++) {
            prefixMax[i] = Math.max(prefixMax[i], prefixMax[i - 1]);
            suffixMin[n - i - 1] = Math.min(suffixMin[n - i - 1], suffixMin[n - i]);
        }

        int count = 1;

        for (int i = 1; i < n ; i++) {

            if (prefixMax[i - 1] <= suffixMin[i]) {
                count++;
            }
        }

        return count;
    }
}