package org.leetcode.problems.p228;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> summaryRanges(int[] nums) {
    List<String> list = new ArrayList<>();
    if(nums.length == 0) return list;
    int n = nums.length;
    int l=0;
    for(int i = 0; i < n; i ++){
      int j = i + 1;
      if(j < n && nums[j] - nums[i] == 1){
        continue;
      }

      String tmp;
      if(l != i){
        tmp = nums[l] + "->" + nums[i];
      }
      else {
        tmp = String.valueOf(nums[l]);
      }
      list.add(tmp);
      l = i + 1;

    }
    return list;
  }
}
