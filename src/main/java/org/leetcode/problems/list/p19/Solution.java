package org.leetcode.problems.list.p19;

import org.leetcode.problems.utils.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode fast, slow;
        fast=slow=head;
        while (fast != null && n > 0) {
            fast = fast.next;
            n--;
            if (fast == null && n > 0) {
                return null;
            }
        }
        fast = fast.next;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
