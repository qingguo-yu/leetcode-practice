package org.leetcode.problems.p560;

import java.util.HashMap;

public class Solution1 implements SolutionInterface {

  public int subarraySum(int[] nums, int k) {
    int result = 0;
    if(nums == null || nums.length == 0) return result;
    int n = nums.length;
    HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
    prefixSumMap.put(0, 1);
    int sum0_i = 0;
    for (int i = 0; i < n; i++) {
      sum0_i += nums[i];
      int sum0_j = sum0_i - k;
      if (prefixSumMap.containsKey(sum0_j)) {
        result += prefixSumMap.get(sum0_j);
      }
      prefixSumMap.put(sum0_i, prefixSumMap.getOrDefault(sum0_i, 0) + 1);
    }
    return result;
  }

}
