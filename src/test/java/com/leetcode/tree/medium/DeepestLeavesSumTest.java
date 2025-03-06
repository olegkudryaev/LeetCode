package com.leetcode.tree.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeepestLeavesSumTest {
    @Test
    void test(){
        //[1,2,3,4,5,null,6,7,null,null,null,null,8]
        DeepestLeavesSum.TreeNode node1 = new DeepestLeavesSum.TreeNode(7, null, null);
        DeepestLeavesSum.TreeNode node2 = new DeepestLeavesSum.TreeNode(4, node1, null);
        DeepestLeavesSum.TreeNode node3 = new DeepestLeavesSum.TreeNode(5, null, null);
        DeepestLeavesSum.TreeNode node4 = new DeepestLeavesSum.TreeNode(2, node2, node3);
        DeepestLeavesSum.TreeNode node5 = new DeepestLeavesSum.TreeNode(8, null, null);
        DeepestLeavesSum.TreeNode node6 = new DeepestLeavesSum.TreeNode(6, null, node5);
        DeepestLeavesSum.TreeNode node7 = new DeepestLeavesSum.TreeNode(3, null, node6);
        DeepestLeavesSum.TreeNode node8 = new DeepestLeavesSum.TreeNode(1, node4, node7);

        int exp = 15;

        int i = DeepestLeavesSum.deepestLeavesSum(node8);

        Assertions.assertEquals(exp, i);

    }
}
