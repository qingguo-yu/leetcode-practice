package org.leetcode.problems.bs.right_bound;

public class Solution1 {

  public int right_bound(int[] nums, int target) {
    if(nums == null || nums.length == 0) return -1;
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] > target) {
        right = mid - 1;
      }
      else {
        left = mid + 1;
      }
    }
    return right;
  }
}
