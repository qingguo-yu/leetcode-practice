package org.leetcode.problems.list.p876;

import org.leetcode.problems.utils.ListNode;

public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast, slow;
        slow=fast=head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
