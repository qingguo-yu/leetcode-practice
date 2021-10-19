package org.leetcode.problems.dp.p300;

import java.util.Arrays;

public class Solution {
  public int lengthOfLIS(int[] nums) {
    if(nums == null || nums.length == 0) return 0;
    int n = nums.length;
    int[] dp = new int[n];
    int result = 1;
    Arrays.fill(dp, 1);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          dp[i] = Integer.max(dp[j] + 1, dp[i]);
        }
        result = Integer.max(result, dp[i]);
      }
    }
    return result;
  }

}
