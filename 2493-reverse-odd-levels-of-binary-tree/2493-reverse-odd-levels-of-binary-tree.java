/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left, root.right, 0);
        return root;
    }

    public void helper(TreeNode leftChild, TreeNode rightChild, int index) {

        if (leftChild == null || rightChild == null)
            return;

        if (index % 2 == 0) {
            int temp = leftChild.val;
            leftChild.val = rightChild.val;
            rightChild.val = temp;
        }

        helper(leftChild.left, rightChild.right, index + 1);
        helper(leftChild.right, rightChild.left, index + 1);
    }
}