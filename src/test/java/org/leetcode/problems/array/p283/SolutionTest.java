package org.leetcode.problems.array.p283;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void moveZeroes() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new Solution().moveZeroes(nums);
        int[] expect = new int[]{1, 3, 12, 0, 0};
        Assertions.assertArrayEquals(expect, nums);
    }
}