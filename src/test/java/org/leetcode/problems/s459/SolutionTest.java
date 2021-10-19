package org.leetcode.problems.s459;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void repeatedSubstringPattern() {
    String s = "a";
    boolean result = new Solution().repeatedSubstringPattern(s);
    Assertions.assertTrue(result);
  }
}