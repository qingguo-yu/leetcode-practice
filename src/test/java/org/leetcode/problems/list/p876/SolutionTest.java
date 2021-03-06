package org.leetcode.problems.list.p876;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.ListNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void middleNode() {
        Integer[] vals = new Integer[]{1, 2, 3, 4, 5};
        ListNode head = Utils.buildListFromArray(vals);
        ListNode middle = new Solution().middleNode(head);
        Assertions.assertEquals(3, middle.val);
    }
    @Test
    void middleNode_oven() {
        Integer[] vals = new Integer[]{1, 2, 3, 4, 5,6};
        ListNode head = Utils.buildListFromArray(vals);
        ListNode middle = new Solution().middleNode(head);
        Assertions.assertEquals(4, middle.val);
    }
}