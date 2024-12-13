import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        helper(candidates, target, 0, new ArrayList<>(), 0, ans);
        return ans;
    }

    public void helper(int[] candidates, int target, int i, List<Integer> curr, int total, List<List<Integer>> ans) {

        if (total == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (total > target || i >= candidates.length) {
            return;
        }

        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }

            curr.add(candidates[j]);
            helper(candidates, target, j + 1, curr, total + candidates[j], ans);
            curr.remove(curr.size() - 1);
        }
    }
}
