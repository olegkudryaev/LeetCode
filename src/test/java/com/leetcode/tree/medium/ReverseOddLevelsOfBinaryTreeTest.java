package com.leetcode.tree.medium;

import com.leetcode.binarytree.medium.BinarySearchTreeToGreaterSumTree;
import com.leetcode.tree.medium.ReverseOddLevelsOfBinaryTree;
import org.junit.jupiter.api.Test;

public class ReverseOddLevelsOfBinaryTreeTest {
    @Test
    void test1() {
        ReverseOddLevelsOfBinaryTree.TreeNode node1 = new ReverseOddLevelsOfBinaryTree.TreeNode(8, null, null);
        ReverseOddLevelsOfBinaryTree.TreeNode node2 = new ReverseOddLevelsOfBinaryTree.TreeNode(13, null, null);
        ReverseOddLevelsOfBinaryTree.TreeNode node3 = new ReverseOddLevelsOfBinaryTree.TreeNode(21, null, null);
        ReverseOddLevelsOfBinaryTree.TreeNode node4 = new ReverseOddLevelsOfBinaryTree.TreeNode(34, null, null);
        ReverseOddLevelsOfBinaryTree.TreeNode node5 = new ReverseOddLevelsOfBinaryTree.TreeNode(3, node1, node2);
        ReverseOddLevelsOfBinaryTree.TreeNode node6 = new ReverseOddLevelsOfBinaryTree.TreeNode(5, node3, node4);
        ReverseOddLevelsOfBinaryTree.TreeNode node7 = new ReverseOddLevelsOfBinaryTree.TreeNode(2, node5, node6);

        ReverseOddLevelsOfBinaryTree.TreeNode node8 = ReverseOddLevelsOfBinaryTree.reverseOddLevels(node7);
    }
}
