package org.leetcode.problems.backtracking.p698;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

  @Test
  void canPartitionKSubsets() {
    int[] nums = new int[]{4,3,2,3,5,2,1};
    boolean result = new Solution1().canPartitionKSubsets(nums, 4);
    Assertions.assertTrue(result);
  }
}