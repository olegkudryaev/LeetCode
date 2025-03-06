package com.leetcode.tree.medium;

public class DeepestLeavesSum {
    /**
     * 1302. Deepest Leaves Sum
     * Medium
     * Topics
     * Companies
     * Hint
     * Given the root of a binary tree, return the sum of values of its deepest leaves.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
     * Output: 15
     * Example 2:
     * <p>
     * Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
     * Output: 19
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [1, 104].
     * 1 <= Node.val <= 100
     */

    private static int maxLevel = 0;
    private static int sum = 0;

    public static int deepestLeavesSum(TreeNode root) {
        deep(root, 0);
        return sum;
    }
    private static void deep(TreeNode root, int level) {
        if (root == null){
            return;
        }

        if(level > maxLevel){
            sum = 0;
            maxLevel = level;
        }

        if(level == maxLevel){
            sum += root.val;
        }

        deep(root.left, level+1);
        deep(root.right, level+1);
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
