package org.leetcode.problems.dp.p72;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

  @Test
  void minDistance() {
    String word1 = "horse", word2 = "ros";
    int expect = 3;
    int result = new Solution1().minDistance(word1, word2);
    Assertions.assertEquals(expect, result);
  }
  @Test
  void minDistance1() {
    String word1 = "intention", word2 = "execution";
    int expect = 5;
    int result = new Solution1().minDistance(word1, word2);
    Assertions.assertEquals(expect, result);
  }
}