package org.leetcode.problems.list.p19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.ListNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeNthFromEnd() {
        Integer[] vals = new Integer[]{1, 2, 3, 4, 5};
        ListNode head = Utils.buildListFromArray(vals);
        new Solution().removeNthFromEnd(head, 1);
        Integer[] result = Utils.buildArrayFromList(head);
        Integer[] expect = new Integer[]{1, 2, 3, 4};
        Assertions.assertArrayEquals(expect, result);
    }

    @Test
    void removeNthFromEnd_2nd() {
        Integer[] vals = new Integer[]{1, 2, 3, 4, 5};
        ListNode head = Utils.buildListFromArray(vals);
        new Solution().removeNthFromEnd(head, 2);
        Integer[] result = Utils.buildArrayFromList(head);
        Integer[] expect = new Integer[]{1, 2, 3, 5};
        Assertions.assertArrayEquals(expect, result);
    }
    @Test
    void removeNthFromEnd1() {
        Integer[] vals = new Integer[]{1, 2};
        ListNode head = Utils.buildListFromArray(vals);
        head = new Solution().removeNthFromEnd(head, 2);
        Integer[] result = Utils.buildArrayFromList(head);
        Integer[] expect = new Integer[]{2};
        Assertions.assertArrayEquals(expect, result);
    }
}