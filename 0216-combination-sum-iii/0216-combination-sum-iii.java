class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(k, n, ans, new ArrayList<>(), 1, 0);
        return ans;
    }

    public void backTrack(int k, int n, List<List<Integer>> ans, List<Integer> temp, int start, int sum) {
        if (sum == n && temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (sum > n || temp.size() > k || start > 9) {
            return;
        }
        // if (temp.size() + (9 - start + 1) < k) {
        //     return;
        // }

        temp.add(start);
        backTrack(k, n, ans, temp, start + 1, sum + start);
        temp.remove(temp.size() - 1);

        backTrack(k, n, ans, temp, start + 1, sum);
    }
}
