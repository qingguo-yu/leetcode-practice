package org.leetcode.problems.list.p24;

import org.leetcode.problems.utils.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newNext = head.next.next;
        ListNode newHead = head.next;
        newHead.next = head;
        head.next = swapPairs(newNext);
        return newHead;
    }
}
