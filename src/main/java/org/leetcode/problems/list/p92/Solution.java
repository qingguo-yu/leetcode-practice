package org.leetcode.problems.list.p92;

import org.leetcode.problems.utils.ListNode;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverseN(head, n);
        }
        head.next = reverseBetween(head.next, m - 1, n - 1);
        return head;
    }
    ListNode successor = null;
    private ListNode reverseN(ListNode head, int n) {

        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode tail = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return tail;
    }
}
