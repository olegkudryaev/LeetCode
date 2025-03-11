package com.leetcode.linkedlist.medium;

import org.junit.jupiter.api.Test;

public class DeleteNodeInLinkedListTest {

    @Test
    void test(){
        DeleteNodeInLinkedList.ListNode node4 = new DeleteNodeInLinkedList.ListNode(9);
        DeleteNodeInLinkedList.ListNode node3 = new DeleteNodeInLinkedList.ListNode(1);
        DeleteNodeInLinkedList.ListNode node2 = new DeleteNodeInLinkedList.ListNode(5);
        DeleteNodeInLinkedList.ListNode node1 = new DeleteNodeInLinkedList.ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        DeleteNodeInLinkedList.deleteNode(node3);
    }
}
