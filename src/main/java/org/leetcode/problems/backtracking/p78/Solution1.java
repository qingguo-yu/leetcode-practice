package org.leetcode.problems.backtracking.p78;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {
  List<List<Integer>> result = new LinkedList<>();
  public List<List<Integer>> subsets(int[] nums) {
    if(nums == null || nums.length == 0 ) return result;
    LinkedList<Integer> subResult = new LinkedList<>();
    backtrack(nums, subResult, 0);
    return result;
  }
  private void backtrack(int[] nums, LinkedList<Integer> subResult, int start){
    result.add(new LinkedList<>(subResult));
    for (int i = start; i < nums.length; i++) {
      subResult.add(nums[i]);
      backtrack(nums, subResult, i + 1);
      subResult.removeLast();
    }
  }
}
