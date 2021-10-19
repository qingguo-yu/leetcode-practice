package org.leetcode.problems.dp.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void minDistance() {
    String word1 = "horse", word2 = "ros";
    int expect = 3;
    int result = new Solution().minDistance(word1, word2);
    Assertions.assertEquals(expect, result);
  }
}