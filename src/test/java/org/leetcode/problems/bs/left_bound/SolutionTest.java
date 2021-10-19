package org.leetcode.problems.bs.left_bound;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void left_bound() {
    int[] nums = new int[]{1, 2, 2, 2, 3};
    int result = new Solution().left_bound(nums, 2);
    Assertions.assertEquals(1, result);
  }
  @Test
  void left_bound_minorOne() {
    int[] nums = new int[]{1, 2, 2, 2, 3};
    int result = new Solution().left_bound(nums, -1);
    Assertions.assertEquals(0, result);
  }
  @Test
  void left_bound_4() {
    int[] nums = new int[]{1, 2, 2, 2, 3};
    int result = new Solution().left_bound(nums, 5);
    Assertions.assertEquals(5, result);
  }
}