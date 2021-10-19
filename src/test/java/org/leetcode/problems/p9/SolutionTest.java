package org.leetcode.problems.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void isPalindrome() {
    boolean result = new Solution().isPalindrome(121);
    Assertions.assertTrue(result);
  }
  @Test
  void isPalindromeReturnFalse() {
    boolean result = new Solution().isPalindrome(123);
    Assertions.assertFalse(result);
  }
  @Test
  void isPalindrome_1() {
    boolean result = new Solution().isPalindrome(1);
    Assertions.assertTrue(result);
  }
}