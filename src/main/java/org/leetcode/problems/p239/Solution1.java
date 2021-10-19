package org.leetcode.problems.p239;

//brute force
public class Solution1 {
  public int[] maxSlidingWindow(int[] nums, int k) {
    if(nums == null || nums.length == 0 || k == 0) return new int[0];
    int n = nums.length;
    int numsOfWindows = n - k + 1;
    int[] result = new int[numsOfWindows];
    for (int start = 0; start < numsOfWindows; start++) {
      int end = start + k - 1;
      int maxVal = nums[start];
      for (int i = start + 1; i <= end; i++) {
        if(nums[i] > maxVal){
          maxVal = nums[i];
        }
      }
      result[start] = maxVal;
    }
    return result;
  }
}
