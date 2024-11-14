import java.util.Arrays;

class Solution {
    public int minimizedMaximum(int n, int[] quantities) {

        int left = 1;
        int right = Arrays.stream(quantities).max().orElse(1);

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (check(quantities, n, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean check(int[] quantities, int n, int mid) {
        int sum = 0;

        for (int q : quantities) {
            sum += (q + mid - 1) / mid;
        }

        return sum <= n;
    }
}
