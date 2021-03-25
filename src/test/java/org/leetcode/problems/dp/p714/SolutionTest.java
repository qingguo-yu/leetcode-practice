package org.leetcode.problems.dp.p714;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
        int[] prices = new int[]{1,3,2,8,4,9};
        int fee = 2;
        int result = new Solution().maxProfit(prices, fee);
        Assertions.assertEquals(8, result);
    }
}