package org.leetcode.problems.list.p160;

import org.leetcode.problems.utils.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA != pB) {
            pA = (pA != null)? pA.next: headB;
            pB = (pB != null)? pB.next: headA;
        }
        return pA;
    }
}
