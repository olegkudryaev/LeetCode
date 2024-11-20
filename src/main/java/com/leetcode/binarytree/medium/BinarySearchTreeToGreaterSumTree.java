package com.leetcode.binarytree.medium;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeToGreaterSumTree {
    /**
     * 1038. Binary Search Tree to Greater Sum Tree
     * Medium
     * Topics
     * Companies
     * Hint
     * Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus the sum of all keys greater than the original key in BST.
     * <p>
     * As a reminder, a binary search tree is a tree that satisfies these constraints:
     * <p>
     * The left subtree of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
     * Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
     * Example 2:
     * <p>
     * Input: root = [0,null,1]
     * Output: [1,null,1]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * The number of nodes in the tree is in the range [1, 100].
     * 0 <= Node.val <= 100
     * All the values in the tree are unique.
     */

    static int temp = 0;

    public static TreeNode bstToGst(TreeNode root) {
        deep(root);
        return root;
    }

    private static void deep(TreeNode root) {
        if (root == null) {
            return;
        }
        deep(root.right);
        temp += root.val;
        root.val = temp;
        deep(root.left);
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
