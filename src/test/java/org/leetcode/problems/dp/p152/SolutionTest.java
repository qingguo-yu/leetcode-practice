package org.leetcode.problems.dp.p152;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void maxProduct() {
    int [] nums = new int[]{2,3,-2,4};
    int result = new Solution().maxProduct(nums);
    Assertions.assertEquals(6, result);
  }
  @Test
  void maxProduct1() {
    int [] nums = new int[]{-2,0,-1};
    int result = new Solution().maxProduct(nums);
    Assertions.assertEquals(0, result);
  }
  @Test
  void maxProduct_s1() {
    int [] nums = new int[]{-2,0,-1};
    int result = new Solution1().maxProduct(nums);
    Assertions.assertEquals(0, result);
  }
}