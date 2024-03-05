package com.leetcode.easy;

import java.util.List;

public class MiddleOfTheLinkedList {
    /**
     * Given the head of a singly linked list, return the middle node of the linked list.
     *
     * If there are two middle nodes, return the second middle node.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: head = [1,2,3,4,5]
     * Output: [3,4,5]
     * Explanation: The middle node of the list is node 3.
     * Example 2:
     *
     *
     * Input: head = [1,2,3,4,5,6]
     * Output: [4,5,6]
     * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
     *
     *
     * Constraints:
     *
     * The number of nodes in the list is in the range [1, 100].
     * 1 <= Node.val <= 100
     */

    public static void main(String[] args) {
        //ListNode next5 = new ListNode(6);
        ListNode next4 = new ListNode(5);
        ListNode next3 = new ListNode(4, next4);
        ListNode next2 = new ListNode(3, next3);
        ListNode next = new ListNode(2, next2);
        ListNode head = new ListNode(1, next);
        middleNode(head);

    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}