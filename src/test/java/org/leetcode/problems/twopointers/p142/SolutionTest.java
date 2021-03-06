package org.leetcode.problems.twopointers.p142;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.ListNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void detectCycle() {
        int[] testdata = new int[]{3,2,0,-4};
        ListNode head = Utils.buildListWithLoopFromArray(testdata, 1);
        ListNode result = new Solution().detectCycle(head);
        Assertions.assertEquals(2, result.val);
    }
}