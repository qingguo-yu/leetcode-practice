package org.leetcode.problems.p506;

import java.util.Arrays;
import java.util.Collections;

public class Solution1 {

  private static final String[] RANK_CONSTANTS = {"Gold Medal", "Silver Medal", "Bronze Medal"};
  public String[] findRelativeRanks(int[] score) {
    int n = score.length;
    int[] copy = Arrays.copyOf(score, n);
    Arrays.sort(copy);
    String[] ranks = new String[n];
    for(int i = 0; i < n; i ++){
      ranks[i] = getRank(score[i], copy);
    }
    return ranks;
  }
  private String getRank(int score_i, int[] copy){
    int left = 0, right = copy.length - 1;
    int rank = -1;
    while(left <= right){
      int mid = left + (right - left) / 2;
      if(copy[mid] == score_i) {
        rank = mid;
        break;
      }
      else if(copy[mid] > score_i){
        right = mid - 1;

      }
      else {
        left = mid + 1;
      }
    }
    rank = copy.length - 1 - rank;
    if(rank < 3) return RANK_CONSTANTS[rank];
    return String.valueOf(rank + 1);
  }
}
