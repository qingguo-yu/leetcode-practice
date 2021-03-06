package org.leetcode.problems.twopointers.p141;

import org.leetcode.problems.utils.ListNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow, fast;
        slow=fast=head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
