package org.leetcode.problems.p703;

import java.util.PriorityQueue;

public class KthLargest {
  private PriorityQueue<Integer> queue ;
  private int k;
  public KthLargest(int k, int[] nums) {
    this.k = k;
    queue = new PriorityQueue<>(k);
    for (int i = 0; i < nums.length; i++) {
      add(nums[i]);
    }
  }

  public int add(int val) {
    if (queue.size() < k) {
      queue.offer(val);
    } else if (val > queue.peek()) {
      queue.poll();
      queue.offer(val);
    }
    return queue.peek();
  }
}
