package org.leetcode.problems.dp.p120;

import java.util.List;

public class Solution {
  public int minimumTotal(List<List<Integer>> triangle) {
    int n = triangle.size();
    int m = triangle.get(n - 1).size();
    int[] minSum = new int[m];
    for (int i = 0; i < m; i++) {
      minSum[i] = triangle.get(n - 1).get(i);
    }
    for (int layer = n - 2; layer >= 0; layer--) {
      for (int i = 0; i <= layer; i++) {
        minSum[i] = Integer.min(minSum[i], minSum[i + 1]) + triangle.get(layer).get(i);
      }
    }
    return minSum[0];
  }
}
