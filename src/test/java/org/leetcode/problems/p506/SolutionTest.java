package org.leetcode.problems.p506;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void findRelativeRanks() {
    int[] score = {5,4,3,2,1};
    String[] expect = {"Gold Medal","Silver Medal","Bronze Medal","4","5"};
    String[] result = new Solution().findRelativeRanks(score);
    Assertions.assertArrayEquals(expect, result);
  }
}