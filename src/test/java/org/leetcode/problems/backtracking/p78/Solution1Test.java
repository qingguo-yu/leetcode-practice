package org.leetcode.problems.backtracking.p78;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

  @Test
  void subsets() {
    int[] nums = new int[]{1,2,3};
    List<List<Integer>> result = new Solution1().subsets(nums);
    Assertions.assertEquals(8, result.size());
  }
}