package org.leetcode.problems.p973;

import java.util.Arrays;

public class Solution2 {
  public int[][] kClosest(int[][] points, int k) {
    int l = 0, r = points.length - 1;
    while (l <= r) {
      int pivotIdx = pivotSelect(points, l, r);
      if (pivotIdx == k) {
        break;
      }
      if (pivotIdx < k) {
          l = pivotIdx + 1;
      }
      else {
        r = pivotIdx - 1;
      }
    }
    return Arrays.copyOfRange(points, 0, k);
  }

  private int pivotSelect(int[][] A, int l, int r) {
    int[] pivot = A[l];
    while (l < r) {
      while (l < r && compare(A[r], pivot) >= 0) r--;
      A[l] = A[r];
      while(l < r && compare(A[l], pivot) <= 0 ) l++;
      A[r] = A[l];
    }
    A[l] = pivot;
    return l;
  }

  private int compare(int[] p1, int[] p2) {
    return p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1];
  }
}
