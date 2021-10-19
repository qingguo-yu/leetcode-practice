package org.leetcode.problems.p560;

import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {
  @Test
  void subarraySum() {
    int[] nums = new int[]{1, 1, 1};
    int result = new Solution().subarraySum(nums, 2);
    Assertions.assertEquals(2, result);
  }

  @ParameterizedTest
  @ValueSource(classes={Solution.class, Solution1.class})
  void subarraySum1(Class solutionClz)
      throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    int[] nums = new int[]{1};
//    int result = new solution().subarraySum(nums, 0);
    SolutionInterface solution = (SolutionInterface) solutionClz.getDeclaredConstructor().newInstance();
    int result = solution.subarraySum(nums, 0);
    Assertions.assertEquals(0, result);
  }
}