class Solution {
    public int minNumberOperations(int[] target) {

        int count = target[0];
        int n = target.length;

        for (int i = 1; i < n; i++) {
            if (target[i - 1] < target[i]) {
                count += target[i] - target[i - 1];
            }
        }

        return count;
    }
}