package org.leetcode.problems.p414;

public class Solution {
  public int thirdMax(int[] nums) {
    int max1 = Integer.MIN_VALUE;
    for(int n : nums){
      if(max1 < n) max1 = n;
    }
    int max2 = Integer.MIN_VALUE;
    for(int n : nums){
      if(max2 < n && n < max1) max2 = n;
    }
    int max3 = Integer.MIN_VALUE;
    for(int n : nums){
      if(max3 < n && n < max1 && n < max2) max3 = n;
    }
    if( max3 == Integer.MIN_VALUE && max3 == max2) return max1;
    return max3;
  }
}
