package org.leetcode.problems.dp.p152;

public class Solution1 {
  public int maxProduct(int[] nums) {
    if(nums == null || nums.length == 0) return 0;
    int max = nums[0], curMax = nums[0], curMin = nums[0];
    int n = nums.length;
    for (int i = 1; i < n; i++) {
      int tmpMax = curMax * nums[i];
      int tmpMin = curMin * nums[i];
      curMax = Integer.max(tmpMax, Integer.max(tmpMin, nums[i]));
      curMin = Integer.min(tmpMin, Integer.min(tmpMax, nums[i]));
      max = Integer.max(max, curMax);
    }
    return max;
  }
}
