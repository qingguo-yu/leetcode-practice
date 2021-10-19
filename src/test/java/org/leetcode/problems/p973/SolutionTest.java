package org.leetcode.problems.p973;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void kClosest() {
    int[][] points = {
        {1,3},
        {-2, 2}
    };
    int[][] result = new Solution().kClosest(points, 1);
    int[][] expect = {
        {-2, 2}
    };

    Assertions.assertArrayEquals(expect, result);
  }
}