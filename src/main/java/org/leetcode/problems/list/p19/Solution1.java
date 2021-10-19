package org.leetcode.problems.list.p19;

import org.leetcode.problems.utils.ListNode;

public class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while(n-- > 0 && fast != null){
            fast = fast.next;
        }
        if (fast == null) {
            return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }
}
