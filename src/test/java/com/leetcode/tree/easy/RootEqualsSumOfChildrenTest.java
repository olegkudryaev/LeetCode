package com.leetcode.tree.easy;

import com.leetcode.tree.medium.MaximumBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RootEqualsSumOfChildrenTest {
    @Test
    void test() {
        RootEqualsSumOfChildren.TreeNode node1 = new RootEqualsSumOfChildren.TreeNode(4, null, null);
        RootEqualsSumOfChildren.TreeNode node2 = new RootEqualsSumOfChildren.TreeNode(6, null, null);
        RootEqualsSumOfChildren.TreeNode node3 = new RootEqualsSumOfChildren.TreeNode(10, node1, node2);

        boolean exp = true;

        boolean b = RootEqualsSumOfChildren.checkTree(node3);

        Assertions.assertEquals(exp, b);

    }
}
