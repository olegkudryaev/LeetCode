package com.leetcode.tree.medium;

import org.junit.jupiter.api.Test;

public class MaximumBinaryTreeTest {

    @Test
    void test() {
        MaximumBinaryTree.TreeNode node1 = new MaximumBinaryTree.TreeNode(1, null, null);
        MaximumBinaryTree.TreeNode node2 = new MaximumBinaryTree.TreeNode(2, null, node1);
        MaximumBinaryTree.TreeNode node3 = new MaximumBinaryTree.TreeNode(0, null, null);
        MaximumBinaryTree.TreeNode node4 = new MaximumBinaryTree.TreeNode(3, null, node2);
        MaximumBinaryTree.TreeNode node5 = new MaximumBinaryTree.TreeNode(5, node3, null);
        MaximumBinaryTree.TreeNode node6 = new MaximumBinaryTree.TreeNode(6, node4, node5);

        int[] nums = {3, 2, 1, 6, 0, 5};

//        int[] exp = {6,3,5,null,2,0,null,null,1}

        MaximumBinaryTree.constructMaximumBinaryTree(nums);
    }
}
