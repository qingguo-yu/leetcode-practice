package org.leetcode.problems.bs.right_bound;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

  @Test
  void right_bound() {
    int[] nums = new int[]{1, 2, 2, 2, 3};
    int result = new Solution1().right_bound(nums, 2);
    Assertions.assertEquals(3, result);
  }

  @Test
  void right_bound_minorOne() {
    int[] nums = new int[]{1, 2, 2, 2, 3};
    int result = new Solution1().right_bound(nums, -1);
    Assertions.assertEquals(-1, result);
  }
  @Test
  void right_bound_4() {
    int[] nums = new int[]{1, 2, 2, 2, 3};
    int result = new Solution1().right_bound(nums, 4);
    Assertions.assertEquals(4, result);
  }
}