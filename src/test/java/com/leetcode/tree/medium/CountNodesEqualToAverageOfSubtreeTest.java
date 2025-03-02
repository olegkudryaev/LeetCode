package com.leetcode.tree.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountNodesEqualToAverageOfSubtreeTest {

    @Test
    void test(){
        CountNodesEqualToAverageOfSubtree.TreeNode node2 = new CountNodesEqualToAverageOfSubtree.TreeNode(0, null, null);
        CountNodesEqualToAverageOfSubtree.TreeNode node3 = new CountNodesEqualToAverageOfSubtree.TreeNode(1, null, null);
        CountNodesEqualToAverageOfSubtree.TreeNode node4 = new CountNodesEqualToAverageOfSubtree.TreeNode(6, null, null);
        CountNodesEqualToAverageOfSubtree.TreeNode node5 = new CountNodesEqualToAverageOfSubtree.TreeNode(8, node2, node3);
        CountNodesEqualToAverageOfSubtree.TreeNode node6 = new CountNodesEqualToAverageOfSubtree.TreeNode(5, null, node4);
        CountNodesEqualToAverageOfSubtree.TreeNode node7 = new CountNodesEqualToAverageOfSubtree.TreeNode(4, node5, node6);

        int expect = 5;

        int node8 = CountNodesEqualToAverageOfSubtree.averageOfSubtree(node7);

        Assertions.assertEquals(expect, node8);
    }
}
