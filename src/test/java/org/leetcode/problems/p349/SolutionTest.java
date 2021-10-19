package org.leetcode.problems.p349;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void intersection() {
    int[] nums1 = new int[]{1,2,2,1};
    int[] nums2 = new int[]{2,2};
    int[] result = new Solution().intersection(nums1, nums2);
    int[] expect = new int[]{2};
    Assertions.assertArrayEquals(expect, result);
  }
}