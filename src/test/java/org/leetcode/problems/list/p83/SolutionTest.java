package org.leetcode.problems.list.p83;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.ListNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void deleteDuplicates() {
        Integer[] data = new Integer[]{1,1,1};
        ListNode head = Utils.buildListFromArray(data);
        new Solution().deleteDuplicates(head);
        Integer[] result = Utils.buildArrayFromList(head);
        Assertions.assertArrayEquals(new Integer[]{1}, result);
    }

    @Test
    void deleteDuplicates_1() {
        Integer[] data = new Integer[]{1,1,2};
        ListNode head = Utils.buildListFromArray(data);
        new Solution().deleteDuplicates(head);
        Integer[] result = Utils.buildArrayFromList(head);
        Assertions.assertArrayEquals(new Integer[]{1, 2}, result);
    }
    @Test
    void deleteDuplicates_emptyList() {
        ListNode result = new Solution().deleteDuplicates(null);
        Assertions.assertEquals(null, result);
    }
}