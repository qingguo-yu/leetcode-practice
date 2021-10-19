package org.leetcode.problems.backtracking.p78;

import java.util.LinkedList;
import java.util.List;

public class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new LinkedList<>(new LinkedList<>());
    if(nums == null || nums.length == 0 ) return result;
    int length = nums.length;
    return subsets(nums, length);
  }
  private List<List<Integer>> subsets(int[] nums, int length){
    List<List<Integer>> result = new LinkedList<>();
    result.add(new LinkedList<>());
    if(length == 0 ) return result;
    int tail = nums[length - 1];
    result = subsets(nums, length - 1);
    int size = result.size();
    for(int i = 0; i < size; i ++){
      List<Integer> newList = new LinkedList<>(result.get(i));
      newList.add(tail);
      result.add(newList);
    }
    return result;
  }
}
