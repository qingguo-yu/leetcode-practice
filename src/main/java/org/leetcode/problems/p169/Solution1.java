package org.leetcode.problems.p169;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
  public int majorityElement(int[] nums) {
    int major=nums[0], count = 1;
    for(int i=1; i<nums.length;i++){
      if(count==0){
        count++;
        major=nums[i];
      }else if(major==nums[i]){
        count++;
      }else count--;

    }
    return major;
  }
}
