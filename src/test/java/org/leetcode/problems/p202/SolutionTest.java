package org.leetcode.problems.p202;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void isHappy() {
    Assertions.assertTrue(new Solution().isHappy(19));
    Assertions.assertFalse(new Solution().isHappy(2));
  }
}