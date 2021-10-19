package org.leetcode.problems.p228;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void summaryRanges() {
    int[] nums = new int[]{0,1,2,4,5,7};
    List<String> list = Arrays.asList("0->2", "4->5", "7");
    List<String> result = new Solution().summaryRanges(nums);
    Assertions.assertEquals(list, result);
    nums = new int[0];
    list = new ArrayList<>();
    result = new Solution().summaryRanges(nums);
    Assertions.assertEquals(list, result);

    nums = new int[]{0};
    list = Arrays.asList("0");
    result = new Solution().summaryRanges(nums);
    Assertions.assertEquals(list, result);

    nums = new int[]{0,2,3,4,6,8,9};
    list = Arrays.asList("0","2->4","6","8->9");
    result = new Solution().summaryRanges(nums);
    Assertions.assertEquals(list, result);

  }
}