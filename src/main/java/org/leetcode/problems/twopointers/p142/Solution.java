package org.leetcode.problems.twopointers.p142;

import org.leetcode.problems.utils.ListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow, fast;
        slow=fast=head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
