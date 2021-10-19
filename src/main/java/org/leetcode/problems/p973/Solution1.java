package org.leetcode.problems.p973;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution1 {
  public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2)->{return p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1];});
    for (int[] p : points) {
      pq.offer(p);
      if (pq.size() > k) {
        pq.poll();
      }
    }
    int[][] res = new int[k][2];
    while (k > 0) {
      res[--k] = pq.poll();
    }
    return res;
  }
}
