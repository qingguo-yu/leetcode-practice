package org.leetcode.problems.twopointers.p141;

import org.leetcode.problems.utils.ListNode;

public class Solution1 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head,  fast = head;
        while (slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
