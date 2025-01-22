package com.leetcode.binarytree.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RangeSumOfBSTTest {
    @Test
    void rangeSumOfBST() {
        TreeNode tree6 = new TreeNode(18);
        TreeNode tree5 = new TreeNode(7);
        TreeNode tree4 = new TreeNode(3);
        TreeNode tree3 = new TreeNode(15, null, tree6);
        TreeNode tree2 = new TreeNode(5, tree4, tree5);
        TreeNode tree1 = new TreeNode(10, tree2, tree3);

        int low = 7, high = 15;

        int expected = 32;

        int i = RangeSumOfBST.rangeSumBST(tree1, low, high);
        Assertions.assertEquals(expected, i);
    }
}
