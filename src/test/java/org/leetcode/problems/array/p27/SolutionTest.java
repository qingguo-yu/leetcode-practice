package org.leetcode.problems.array.p27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void removeElement() {
        int[] nums = new int[]{3, 2, 2, 3};
        int result = new Solution().removeElement(nums, 3);
        Assertions.assertEquals(2, result);
    }
}