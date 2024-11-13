package com.leetcode.linkedlist.easy;

import org.junit.jupiter.api.Test;

public class MergeNodesInBetweenZerosTest {

    @Test
    void test1() {
        int[] nums = {0, 3, 1, 0, 4, 5, 2, 0};
        int[] expect = {4,11};

        MergeNodesInBetweenZeros.ListNode listNode8 = new MergeNodesInBetweenZeros.ListNode(0);
        MergeNodesInBetweenZeros.ListNode listNode7 = new MergeNodesInBetweenZeros.ListNode(2, listNode8);
        MergeNodesInBetweenZeros.ListNode listNode6 = new MergeNodesInBetweenZeros.ListNode(5, listNode7);
        MergeNodesInBetweenZeros.ListNode listNode5 = new MergeNodesInBetweenZeros.ListNode(4, listNode6);
        MergeNodesInBetweenZeros.ListNode listNode4 = new MergeNodesInBetweenZeros.ListNode(0, listNode5);
        MergeNodesInBetweenZeros.ListNode listNode3 = new MergeNodesInBetweenZeros.ListNode(1, listNode4);
        MergeNodesInBetweenZeros.ListNode listNode2 = new MergeNodesInBetweenZeros.ListNode(3, listNode3);
        MergeNodesInBetweenZeros.ListNode listNode1 = new MergeNodesInBetweenZeros.ListNode(0, listNode2);

        MergeNodesInBetweenZeros.ListNode listNode = MergeNodesInBetweenZeros.mergeNodes(listNode1);


    }
}
