class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), 0, ans);
        return ans;
    }

    public void helper(int[] candidates, int target, int i, List<Integer> curr, int total,
            List<List<Integer>> ans) {

        if (total == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (total > target || i > candidates.length - 1) {
            return;
        }

        curr.add(candidates[i]);
        helper(candidates, target, i, curr, total + candidates[i], ans);
        curr.remove(curr.size() - 1);
        helper(candidates, target, i + 1, curr, total, ans);
    }
}