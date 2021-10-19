package org.leetcode.problems.p345;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void reverseVowels() {
    String s = "hello";
    String result = new Solution().reverseVowels(s);
    String expect = "holle";
    Assertions.assertEquals(expect, result);

    s = "aA";
    result = new Solution().reverseVowels(s);
    expect = "Aa";
    Assertions.assertEquals(expect, result);
  }
}