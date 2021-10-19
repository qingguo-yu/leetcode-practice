package org.leetcode.problems.p560;

public class Solution implements SolutionInterface {

  public int subarraySum(int[] nums, int k) {
    int result = 0;
    if(nums == null || nums.length == 0) return result;
    int n = nums.length;
    int[] prefixSum = new int[n + 1];
    prefixSum[0] = 0;
    for (int i = 0; i < n; i++) {
      prefixSum[i + 1] = prefixSum[i] + nums[i];
    }
    for (int i = 0; i < n + 1; i++) {
      for (int j = i + 1; j < n + 1; j++) {
        if (prefixSum[j] - prefixSum[i] == k) {
          result ++;
        }
      }
    }
    return result;
  }

}
