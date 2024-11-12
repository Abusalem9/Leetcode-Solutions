import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {

        Arrays.sort(items, Comparator.comparingInt(o -> o[0]));

        int maxBeauty = 0;
        for (int i = 0; i < items.length; i++) {
            maxBeauty = Math.max(maxBeauty, items[i][1]);
            items[i][1] = maxBeauty;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = 0;
            int right = items.length - 1;

            int res = 0;


            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (items[mid][0] <= queries[i]) {
                    res = items[mid][1];
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            ans[i] = res;
        }

        return ans;
    }
}
