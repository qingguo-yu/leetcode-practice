package org.leetcode.problems.p746;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void findComplement() {
    int num = 5;
    int result = new Solution().findComplement(5);
    Assertions.assertEquals(2, result);
  }
}