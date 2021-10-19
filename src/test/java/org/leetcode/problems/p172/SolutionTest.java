package org.leetcode.problems.p172;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void trailingZeroes() {
    int n = 3;
    int result = new Solution().trailingZeroes(3);
    Assertions.assertEquals(0, result);
    result = new Solution().trailingZeroes(7);
    Assertions.assertEquals(1, result);
    result = new Solution().trailingZeroes(10000);
    Assertions.assertEquals(2499, result);
  }
}