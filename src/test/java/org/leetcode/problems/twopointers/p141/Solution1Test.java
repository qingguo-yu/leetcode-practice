package org.leetcode.problems.twopointers.p141;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.ListNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void hasCycle() {
        int[] testdata = new int[]{3,2,0,-4};
        ListNode head = Utils.buildListWithLoopFromArray(testdata, 1);
        boolean hasCycle = new Solution1().hasCycle(head);
        Assertions.assertEquals(true, hasCycle);
    }
}