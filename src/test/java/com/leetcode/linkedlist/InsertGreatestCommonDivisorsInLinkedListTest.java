package com.leetcode.linkedlist;

import org.junit.jupiter.api.Test;

public class InsertGreatestCommonDivisorsInLinkedListTest {

    @Test
    void test1() {

        InsertGreatestCommonDivisorsInLinkedList.ListNode listNode4 = new InsertGreatestCommonDivisorsInLinkedList.ListNode(3);
        InsertGreatestCommonDivisorsInLinkedList.ListNode listNode3 = new InsertGreatestCommonDivisorsInLinkedList.ListNode(10, listNode4);
        InsertGreatestCommonDivisorsInLinkedList.ListNode listNode2 = new InsertGreatestCommonDivisorsInLinkedList.ListNode(6, listNode3);
        InsertGreatestCommonDivisorsInLinkedList.ListNode listNode1 = new InsertGreatestCommonDivisorsInLinkedList.ListNode(18, listNode2);

        InsertGreatestCommonDivisorsInLinkedList.ListNode listNode = InsertGreatestCommonDivisorsInLinkedList.insertGreatestCommonDivisors(listNode1);
    }

}
