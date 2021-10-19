package org.leetcode.problems.p186;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void convertToTitle() {
    String result = new Solution().convertToTitle(1);
    Assertions.assertEquals("A", result);
    result = new Solution().convertToTitle(26);
    Assertions.assertEquals("Z", result);
    result = new Solution().convertToTitle(28);
    Assertions.assertEquals("AB", result);
    result = new Solution().convertToTitle(701);
    Assertions.assertEquals("ZY", result);
    result = new Solution().convertToTitle(2147483647);
    Assertions.assertEquals("FXSHRXW", result);
    result = new Solution().convertToTitle(52);
    Assertions.assertEquals("AZ", result);
  }
}