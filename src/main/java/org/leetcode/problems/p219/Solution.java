package org.leetcode.problems.p219;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> set = new HashSet<Integer>(); //maintenance the window of current potencial  candidates
    for(int i = 0; i < nums.length; i++){
      if(i > k) set.remove(nums[i-k-1]); //remove element out of window
      if(!set.add(nums[i])) return true;
    }
    return false;
  }
}
