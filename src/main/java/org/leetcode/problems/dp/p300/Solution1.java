package org.leetcode.problems.dp.p300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution1 {
  public int lengthOfLIS(int[] nums) {
    if(nums == null || nums.length == 0) return 0;
    int n = nums.length;
    int[] lis = new int[n];
    int size = 0;
    for (int x : nums) {
      int i = 0, j = size;
      while (i != j) {
        int m = (i + j) / 2;
        if (lis[m] < x) {
          i = m + 1;
        }
        else {
          j = m;
        }
      }
      lis[i] = x;
      if( i == size) ++size; //add x at tail of array lis
    }
    return size;
  }

}
