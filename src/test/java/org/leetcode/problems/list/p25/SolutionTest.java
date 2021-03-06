package org.leetcode.problems.list.p25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.ListNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseKGroup() {
        Integer[] vals = new Integer[]{1, 2, 3, 4, 5};
        ListNode head = Utils.buildListFromArray(vals);
        head = new Solution().reverseKGroup(head, 2);
        Integer[] result = Utils.buildArrayFromList(head);
        Integer[] expect = new Integer[]{2,1,4,3,5};
        Assertions.assertArrayEquals(expect, result);
    }
}