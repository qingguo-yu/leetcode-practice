package org.leetcode.problems.dp.p309;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
        int[] prices = new int[]{1, 2, 3, 0, 2};
        int result = new Solution().maxProfit(prices);
        Assertions.assertEquals(3, result);
    }
}