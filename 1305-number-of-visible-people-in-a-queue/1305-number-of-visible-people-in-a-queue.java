class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];
        int[] stack = new int[n];
        int top = -1;

        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            while (top >= 0 && heights[i] > stack[top]) {
                top--;
                count++;
            }
            if (top >= 0) {
                count++;
            }
            res[i] = count;
            stack[++top] = heights[i];
        }

        return res;
    }
}
