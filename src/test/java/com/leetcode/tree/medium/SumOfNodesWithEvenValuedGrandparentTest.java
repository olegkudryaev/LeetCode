package com.leetcode.tree.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfNodesWithEvenValuedGrandparentTest {

    @Test
    void test(){
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode1 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(5, null, null);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode2 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(3, null, treeNode1);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode3 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(1, null, null);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode4 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(8, treeNode3, treeNode2);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode5 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(4, null, null);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode6 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(1, null, null);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode7 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(9, null, null);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode8 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(2, treeNode7, null);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode9 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(7, treeNode6, treeNode5);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode10 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(7, treeNode8, treeNode9);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode11 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(6, treeNode10, treeNode4);

        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode12 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(1, null, null);

        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode13 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(72, null, null);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode14 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(56, null, treeNode13);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode15 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(13, null, null);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode16 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(46, null, treeNode14);
        SumOfNodesWithEvenValuedGrandparent.TreeNode treeNode17 = new SumOfNodesWithEvenValuedGrandparent.TreeNode(61, treeNode15, treeNode16);

        int i = SumOfNodesWithEvenValuedGrandparent.sumEvenGrandparent(treeNode17);
        Assertions.assertEquals(72, i);

    }
}
