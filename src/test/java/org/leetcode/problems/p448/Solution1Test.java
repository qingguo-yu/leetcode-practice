package org.leetcode.problems.p448;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

  @Test
  void findDisappearedNumbers() {
    int[] nums = {2,2};
    List<Integer> list = new Solution1().findDisappearedNumbers(nums);
    List<Integer> expect = Arrays.asList(1);
    Assertions.assertEquals(expect, list);

    nums = new int[]{1,1};
    list = new Solution1().findDisappearedNumbers(nums);
    expect = Arrays.asList(2);
    Assertions.assertEquals(expect, list);
  }

}