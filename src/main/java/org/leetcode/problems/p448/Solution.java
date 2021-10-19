package org.leetcode.problems.p448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> list = new ArrayList<>();
    Arrays.sort(nums);
    int n = nums.length;
    int start =  1;
    int end = nums[0] ;
    fillMissingNumbers(start, end, list);
    for(int i = 1; i < n; i ++){
      start =  nums[i - 1] + 1;
      end = nums[i] ;
      fillMissingNumbers(start, end, list);
    }
    start = nums[n - 1] + 1;
    end = n + 1;
    fillMissingNumbers(start, end,  list);
    return list;
  }
  private void fillMissingNumbers(int start, int end, List<Integer> list){
    while(end  - start > 0){
      list.add(start);
      start ++;
    }
  }
}
