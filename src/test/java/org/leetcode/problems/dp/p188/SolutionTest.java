package org.leetcode.problems.dp.p188;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {
        int[] prices = new int[] {2,4,3,1};
        int result = new Solution().maxProfit(2, prices);
        Assertions.assertEquals(2, result);
    }
    @Test
    void maxProfit_2() {
        int[] prices = new int[] {3,2,6,5,0,3};
        int result = new Solution().maxProfit(5, prices);
        Assertions.assertEquals(2, result);
    }

    @Test
    void maxProfit_1() {
        int[] prices = new int[] {2,4,3,1};
        int result = new Solution().maxProfit(1, prices);
        Assertions.assertEquals(2, result);
    }

    @Test
    void maxProfit_3() {
        int[] prices = new int[] {2,4};
        int result = new Solution().maxProfit(2, prices);
        Assertions.assertEquals(2, result);
    }
    @Test
    void maxProfit_4() {
        int[] prices = new int[] {7,8,5,6};
        int result = new Solution().maxProfit(1, prices);
        Assertions.assertEquals(1, result);
        result = new Solution().maxProfit(2, prices);
        Assertions.assertEquals(2, result);
    }
}