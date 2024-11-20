package com.leetcode.binarytree.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeToGreaterSumTreeTest {
    @Test
    void test1(){
        BinarySearchTreeToGreaterSumTree.TreeNode node1 = new BinarySearchTreeToGreaterSumTree.TreeNode(3);
        BinarySearchTreeToGreaterSumTree.TreeNode node2 = new BinarySearchTreeToGreaterSumTree.TreeNode(2, null, node1);
        BinarySearchTreeToGreaterSumTree.TreeNode node3 = new BinarySearchTreeToGreaterSumTree.TreeNode(0, null, null);
        BinarySearchTreeToGreaterSumTree.TreeNode node4 = new BinarySearchTreeToGreaterSumTree.TreeNode(1, node3, node2);
        BinarySearchTreeToGreaterSumTree.TreeNode node5 = new BinarySearchTreeToGreaterSumTree.TreeNode(8, null, null);
        BinarySearchTreeToGreaterSumTree.TreeNode node6 = new BinarySearchTreeToGreaterSumTree.TreeNode(7, null, node5);
        BinarySearchTreeToGreaterSumTree.TreeNode node7 = new BinarySearchTreeToGreaterSumTree.TreeNode(5, null, null);
        BinarySearchTreeToGreaterSumTree.TreeNode node8 = new BinarySearchTreeToGreaterSumTree.TreeNode(6, node7, node6);
        BinarySearchTreeToGreaterSumTree.TreeNode node9 = new BinarySearchTreeToGreaterSumTree.TreeNode(4, node4, node8);


        BinarySearchTreeToGreaterSumTree.TreeNode node10 = new BinarySearchTreeToGreaterSumTree.TreeNode(33);
        BinarySearchTreeToGreaterSumTree.TreeNode node20= new BinarySearchTreeToGreaterSumTree.TreeNode(35, null, node10);
        BinarySearchTreeToGreaterSumTree.TreeNode node30 = new BinarySearchTreeToGreaterSumTree.TreeNode(36, null, null);
        BinarySearchTreeToGreaterSumTree.TreeNode node40 = new BinarySearchTreeToGreaterSumTree.TreeNode(36, node30, node20);
        BinarySearchTreeToGreaterSumTree.TreeNode node50 = new BinarySearchTreeToGreaterSumTree.TreeNode(8, null, null);
        BinarySearchTreeToGreaterSumTree.TreeNode node60 = new BinarySearchTreeToGreaterSumTree.TreeNode(15, null, node50);
        BinarySearchTreeToGreaterSumTree.TreeNode node70 = new BinarySearchTreeToGreaterSumTree.TreeNode(26, null, null);
        BinarySearchTreeToGreaterSumTree.TreeNode node80 = new BinarySearchTreeToGreaterSumTree.TreeNode(21, node70, node60);
        BinarySearchTreeToGreaterSumTree.TreeNode node90 = new BinarySearchTreeToGreaterSumTree.TreeNode(30, node40, node80);

        BinarySearchTreeToGreaterSumTree.TreeNode treeNode = BinarySearchTreeToGreaterSumTree.bstToGst(node9);

//        Assertions.assertEquals(node90, treeNode);
    }
}
