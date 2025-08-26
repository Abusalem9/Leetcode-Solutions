class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        double max = 0;
        int[] ans = new int[2];

        for (int[] d : dimensions) {
            int a = d[0];
            int b = d[1];

            double sum = Math.sqrt(a * a + b * b);
            if (sum > max || (sum == max && a * b > ans[0] * ans[1])) {
                max = sum;
                ans = d;
            }

        }

        return ans[0] * ans[1];
    }
}