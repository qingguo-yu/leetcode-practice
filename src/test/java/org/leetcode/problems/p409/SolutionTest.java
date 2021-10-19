package org.leetcode.problems.p409;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void longestPalindrome() {
    String s = "abccccdd";
    int n = new Solution().longestPalindrome(s);
    Assertions.assertEquals(7, n);
    s = "ccc";
    n = new Solution().longestPalindrome(s);
    Assertions.assertEquals(3, n);
  }
}