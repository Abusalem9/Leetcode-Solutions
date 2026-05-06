class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int[] ans = new int[n];
        int m = 0;

        for (int j = 0; j < order.length; j++) {
            for (int i = 0; i < n; i++) {
                if (order[j] == friends[i]) {
                    ans[m++] = order[j];
                    break;
                }
            }
        }
        return ans;
    }
}