package org.leetcode.problems.bs.left_bound;

public class Solution {

  public int left_bound(int[] nums, int target) {
    if(nums == null || nums.length == 0) return -1;
    int left = 0;
    int right = nums.length;
    while (left < right) {
      while (left < right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
          left = mid + 1;
        }
        else {
          right = mid;
        }
      }
    }
    return left;
  }
}
