package org.leetcode.problems.dp.p322;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

  @Test
  void coinChange() {
    int[] coins = new int[]{1, 2, 5};
    int result = new Solution1().coinChange(coins, 11);
    Assertions.assertEquals(3, result);
  }
}