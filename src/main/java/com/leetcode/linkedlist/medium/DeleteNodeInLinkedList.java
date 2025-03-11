package com.leetcode.linkedlist.medium;

public class DeleteNodeInLinkedList {

    public static void deleteNode(ListNode node) {
        /**
         * 1. Взять значение следующего узла
         * 2. Взять ссылку следующего узла
         * 3. Удалить следующей узел
         */

        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
