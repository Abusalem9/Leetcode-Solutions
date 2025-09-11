/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        bfs(root, ans, 0);
        return ans;
    }

    public void bfs(TreeNode root, List<List<Integer>> ans, int level) {
        if (root == null)
            return;

        if (ans.size() > level) {
            if (level % 2 == 0) {
                ans.get(level).add(root.val);
            } else {
                ans.get(level).add(0, root.val);
            }
        } else {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(root.val);
            ans.add(temp);
        }

        bfs(root.left, ans, level + 1);
        bfs(root.right, ans, level + 1);

    }
}