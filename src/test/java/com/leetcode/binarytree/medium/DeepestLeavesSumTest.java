package com.leetcode.binarytree.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeepestLeavesSumTest {

    @Test
    void test(){
        DeepestLeavesSum.TreeNode node = new DeepestLeavesSum.TreeNode(7);
        DeepestLeavesSum.TreeNode node2 = new DeepestLeavesSum.TreeNode(4, node, null);
        DeepestLeavesSum.TreeNode node3 = new DeepestLeavesSum.TreeNode(5);
        DeepestLeavesSum.TreeNode node4 = new DeepestLeavesSum.TreeNode(2, node2, node3);

        DeepestLeavesSum.TreeNode node1 = new DeepestLeavesSum.TreeNode(8);
        DeepestLeavesSum.TreeNode node5 = new DeepestLeavesSum.TreeNode(6, null, node1);
        DeepestLeavesSum.TreeNode node6 = new DeepestLeavesSum.TreeNode(3, null, node5);

        DeepestLeavesSum.TreeNode node7 = new DeepestLeavesSum.TreeNode(1, node4, node6);

        int exp = 15;

        int i = DeepestLeavesSum.deepestLeavesSum(node7);

        Assertions.assertEquals(exp, i);
    }

}
