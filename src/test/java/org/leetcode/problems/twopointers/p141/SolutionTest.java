package org.leetcode.problems.twopointers.p141;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.ListNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hasCycle() {
        int[] testdata = new int[]{3,2,0,-4};
        ListNode head = Utils.buildListWithLoopFromArray(testdata, 1);
        boolean result = new Solution().hasCycle(head);
        Assertions.assertEquals(true, result);
    }

    @Test
    void hasCycle_noCycle() {
        Integer[] testdata = new Integer[]{3,2,0,-4};
        ListNode head = Utils.buildListFromArray( testdata);
        boolean result = new Solution().hasCycle(head);
        Assertions.assertEquals(false, result);
    }
}