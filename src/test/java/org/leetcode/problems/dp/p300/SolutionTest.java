package org.leetcode.problems.dp.p300;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void lengthOfLIS() {
    int[] nums = new int[]{10,9,2,5,3,7,101,18};
    int result = new Solution().lengthOfLIS(nums);
    Assertions.assertEquals(4, result);
  }
  @Test
  void lengthOfLIS_Equal_Elements() {
    int[] nums = new int[]{7,7,7};
    int result = new Solution().lengthOfLIS(nums);
    Assertions.assertEquals(1, result);
  }
}