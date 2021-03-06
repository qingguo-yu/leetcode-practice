package org.leetcode.problems.array.p26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeDuplicates() {
        int[] nums = new int[]{1,1,2};
        int result = new Solution().removeDuplicates(nums);
        Assertions.assertEquals(2, result);
    }
}