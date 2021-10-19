package org.leetcode.problems.p239;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void maxSlidingWindow() {
    int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
    int[] expect = new int[]{3, 3, 5,5,6,7};
    int[] result = new Solution().maxSlidingWindow(nums, 3);
    Assertions.assertArrayEquals(expect, result);
  }
}