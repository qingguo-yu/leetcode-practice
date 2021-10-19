package org.leetcode.problems.dp.p322;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void coinChange() {
    int[] coins = new int[]{1, 2, 5};
    int result = new Solution().coinChange(coins, 11);
    Assertions.assertEquals(3, result);
  }
}