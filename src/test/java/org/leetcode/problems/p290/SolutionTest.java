package org.leetcode.problems.p290;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void wordPattern() {
    String pattern = "abba", s = "dog cat cat dog";
    boolean result = new Solution().wordPattern(pattern, s);
    Assertions.assertTrue(result);
    s = "dog cat cat fish";
    result = new Solution().wordPattern(pattern, s);
    Assertions.assertFalse(result);
    pattern = "aaaa";
    s = "dog cat cat dog";
    result = new Solution().wordPattern(pattern, s);
    Assertions.assertFalse(result);
    pattern = "abba";
    s = "dog dog dog dog";
    result = new Solution().wordPattern(pattern, s);
    Assertions.assertFalse(result);
  }
}