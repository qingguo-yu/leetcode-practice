package org.leetcode.problems.p506;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

  private static final String[] RANK_CONSTANTS = {"Gold Medal", "Silver Medal", "Bronze Medal"};
  public String[] findRelativeRanks(int[] score) {
    int n = score.length;

    int[] copy = Arrays.stream(score).boxed()
      .sorted(Collections.reverseOrder())
      .mapToInt(Integer::intValue)
      .toArray();
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
        left = mid + 1;
      }
      else {
        right = mid - 1;
      }
    }
    if(rank < 3) return RANK_CONSTANTS[rank];
    return String.valueOf(rank + 1);
  }
}
