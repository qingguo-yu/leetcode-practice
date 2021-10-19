package org.leetcode.problems.p389;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void findTheDifference() {
    String s = "abcd", t = "bacde";
    char result = new Solution().findTheDifference(s, t);
    Assertions.assertEquals('e', result);
    s = "a";
    t = "aa";
    result = new Solution().findTheDifference(s, t);
    Assertions.assertEquals('e', result);
  }
}