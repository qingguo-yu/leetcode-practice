package org.leetcode.problems.p496;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void nextGreaterElement() {
    int[] nums1 = {4, 1, 2};
    int[] nums2 = {1, 3, 4, 2};
    int[] expect = {-1, 3, -1};
    int[] result = new Solution().nextGreaterElement(nums1, nums2);
    Assertions.assertArrayEquals(expect, result);
  }
}