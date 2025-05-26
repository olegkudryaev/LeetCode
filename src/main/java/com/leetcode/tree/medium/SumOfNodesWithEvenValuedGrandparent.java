package com.leetcode.tree.medium;

import java.util.Optional;

public class SumOfNodesWithEvenValuedGrandparent {
    /**
     * 1315. Sum of Nodes with Even-Valued Grandparent
     * Medium
     * Topics
     * Companies
     * Hint
     * Given the root of a binary tree, return the sum of values of nodes with an even-valued grandparent. If there are no nodes with an even-valued grandparent, return 0.
     * <p>
     * A grandparent of a node is the parent of its parent if it exists.
     */

    static int sum = 0;

    public static int sumEvenGrandparent(TreeNode root) {
        deep(root);
        return sum;
    }

    private static void deep(TreeNode root) {
        if (root.val % 2 == 0) {
            if (root.left != null) {
                if (root.left.left != null) {
                    sum += Optional.ofNullable(root.left.left.val).orElse(0);
                }
                if (root.left.right != null) {
                    sum += Optional.ofNullable(root.left.right.val).orElse(0);
                }
            }
            if (root.right != null) {
                if (root.right.left != null) {
                    sum += Optional.ofNullable(root.right.left.val).orElse(0);
                }
                if (root.right.right != null) {
                    sum += Optional.ofNullable(root.right.right.val).orElse(0);
                }
            }
        }
        if (root.left != null) {
            deep(root.left);
        }
        if (root.right != null) {
            deep(root.right);
        }
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

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
