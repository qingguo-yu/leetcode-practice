package org.leetcode.problems.bs.p704;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void search() {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int result = new Solution().search(nums, 9);
        Assertions.assertEquals(4, 4);
    }
}