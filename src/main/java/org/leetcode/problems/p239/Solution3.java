package org.leetcode.problems.p239;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Solution3 {

  public int[] maxSlidingWindow(int[] nums, int k) {
    if(nums == null || nums.length == 0 || k == 0) return new int[0];
    int n = nums.length;
    int[] result = new int[n - k + 1];
    Deque<Integer> win = new ArrayDeque<>();

    for (int i = 0; i < n; i++) {
      while (win.size() > 0 && win.peekFirst() <= i - k) {
        win.pollFirst();
      }
      while (win.size() > 0 && nums[win.peekLast()] < nums[i]) {
        win.pollLast();
      }
      win.offerLast(i);
      if (i >= k - 1) {
        result[i - k + 1] = nums[win.peekFirst()];
      }
    }
    return result;
  }
}
