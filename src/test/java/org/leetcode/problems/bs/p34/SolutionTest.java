package org.leetcode.problems.bs.p34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchRange() {
        int[] nums = new int[]{1, 2, 2, 4};
        int[] result = new Solution().searchRange(nums, 2);
        Assertions.assertArrayEquals(new int[]{1,2}, result);

    }
}