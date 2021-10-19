package org.leetcode.problems.p560;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

  @Test
  void subarraySum() {
    int[] nums = new int[]{1, 1, 1};
    int result = new Solution().subarraySum(nums, 2);
    Assertions.assertEquals(2, result);
  }
  @Test
  void subarraySum1() {
    int[] nums = new int[]{1};
    int result = new Solution().subarraySum(nums, 0);
    Assertions.assertEquals(0, result);
  }
}