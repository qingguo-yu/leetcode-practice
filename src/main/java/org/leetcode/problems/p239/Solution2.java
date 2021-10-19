package org.leetcode.problems.p239;

import java.util.PriorityQueue;

public class Solution2 {

  public int[] maxSlidingWindow(int[] nums, int k) {
    if(nums == null || nums.length == 0 || k == 0) return new int[0];
    int n = nums.length;
    int[] result = new int[n - k + 1];
    PriorityQueue<Integer> maxPQ = new PriorityQueue<>((i1, i2) -> (nums[i2] - nums[i1]));
    for (int i = 0; i < n; i++) {
      int start = i - k;
      if (start >= 0) {
        maxPQ.remove(start);
      }
      maxPQ.offer(i);
      if (maxPQ.size() == k) {
        result[i - k + 1] = nums[maxPQ.peek()];
      }
    }
    return result;
  }
}
