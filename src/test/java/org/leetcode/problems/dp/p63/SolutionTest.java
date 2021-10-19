package org.leetcode.problems.dp.p63;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.dp.p63.Solution;

class SolutionTest {

  @Test
  void uniquePathsWithObstacles() {
    int[][] obstacleGrid = new int[][]{{1,0}};
    int result = new Solution().uniquePathsWithObstacles(obstacleGrid);
    Assertions.assertEquals(0, result);
  }
}