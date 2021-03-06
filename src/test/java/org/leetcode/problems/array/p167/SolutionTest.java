package org.leetcode.problems.array.p167;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {
        int[] numbers = new int[] {2,7,11,15};
        int target = 9;
        int[] result = new Solution().twoSum(numbers, target);
        Assertions.assertArrayEquals(new int[]{0, 1}, result);
    }
}