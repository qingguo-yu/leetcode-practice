package org.leetcode.problems.p169;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

  @Test
  void majorityElement() {
    int result = new Solution1().majorityElement(new int[]{3, 2, 3});
    Assertions.assertEquals(3, result);
    int[] nums = new int[]{2,2,1,1,1,2,2};
    result = new Solution1().majorityElement(nums);
    Assertions.assertEquals(2, result);
  }
}