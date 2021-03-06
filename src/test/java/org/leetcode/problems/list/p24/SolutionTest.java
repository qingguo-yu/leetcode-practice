package org.leetcode.problems.list.p24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.ListNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void swapPairs() {
        Integer[] vals = new Integer[]{1,2,3,4};
        ListNode head = new Solution().swapPairs(Utils.buildListFromArray(vals));
        Integer[] result = Utils.buildArrayFromList(head);
        Assertions.assertArrayEquals(new Integer[]{2,1,4,3}, result);
    }
}