package org.leetcode.problems.p414;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void thirdMax() {
    int[] array = {1,2,-2147483648};
    int thirdMax = new Solution().thirdMax(array);
    Assertions.assertEquals(-2147483648, thirdMax);
  }
}