package org.leetcode.problems.p492;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void constructRectangle() {
    int area = 4;
    int[] result = new Solution().constructRectangle(area);
    Assertions.assertArrayEquals(new int[]{2, 2}, result);
    result = new Solution().constructRectangle(37);
    Assertions.assertArrayEquals(new int[]{37, 1}, result);

    result = new Solution().constructRectangle(122122);
    Assertions.assertArrayEquals(new int[]{427, 286}, result);
  }
}