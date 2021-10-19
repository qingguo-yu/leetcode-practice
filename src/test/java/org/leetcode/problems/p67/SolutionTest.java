package org.leetcode.problems.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void addBinary() {
    String a = "11", b = "1";
    String result = new Solution().addBinary(a, b);
    Assertions.assertEquals("100", result);
  }
}