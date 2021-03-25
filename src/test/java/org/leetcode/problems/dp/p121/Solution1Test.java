package org.leetcode.problems.dp.p121;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void maxProfit() {
        int[] prices = new int[]{7,1,5,3,6,4};
        int profit = new Solution1().maxProfit(prices);
        Assertions.assertEquals(5, profit);
    }
}