package com.leetcode.tree.easy;

public class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree {
    /**
     * 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
     * Easy
     * Topics
     * Companies
     * Given two binary trees original and cloned and given a reference to a node target in the original tree.
     * <p>
     * The cloned tree is a copy of the original tree.
     * <p>
     * Return a reference to the same node in the cloned tree.
     * <p>
     * Note that you are not allowed to change any of the two trees or the target node and the answer must be a reference to a node in the cloned tree.
     */

    public static TreeNode result;

    public final static TreeNode getTargetCopy(final TreeNode original,
                                               final TreeNode cloned,
                                               final TreeNode target) {
        deep(original, cloned, target);

        return result;
    }

    private static void deep(final TreeNode original,
                                 final TreeNode cloned,
                                 final TreeNode target){
        if(original == null){
            return;
        }
        if (original == target){
            result = cloned;
        }
        deep(original.left, cloned.left, target);
        deep(original.right, cloned.right, target);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
