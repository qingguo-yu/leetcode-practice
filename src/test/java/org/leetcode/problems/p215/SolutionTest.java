package org.leetcode.problems.p215;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findKthLargest() {
        int[] nums = new int[]{3,2,1,5,6,4};
        int result = new Solution().findKthLargest(nums, 2);
        Assertions.assertEquals(5, result);
    }
}