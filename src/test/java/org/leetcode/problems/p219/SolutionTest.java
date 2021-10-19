package org.leetcode.problems.p219;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void containsNearbyDuplicate() {
    int[] nums = new int[]{1,1,3,1};
    boolean result = new Solution().containsNearbyDuplicate(nums, 3);
    Assertions.assertTrue(result);
  }
}