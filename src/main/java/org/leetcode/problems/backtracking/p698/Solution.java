package org.leetcode.problems.backtracking.p698;

import java.util.Comparator;
import java.util.stream.IntStream;

class Solution {
  public boolean canPartitionKSubsets(int[] nums, int k) {
    if(nums == null || nums.length == 0 || nums.length < k) return false;
    int sum = 0;
    for(int n: nums) sum += n;
    if(sum % k != 0) return false;
    int[] buckets = new int[k];
    int target = sum / k ;
    nums = IntStream.of(nums).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
    return backtrack(nums,  0, buckets, target);
  }
  boolean backtrack(int[] nums, int index, int[] buckets, int target){
    // exit condition
    if( index == nums.length){
      for(int i = 0; i < buckets.length; i ++){
        if(buckets[i] != target){
          return false;
        }
      }
      return true;
    }
    //checking...
    for(int i = 0; i < buckets.length; i ++){
      if(buckets[i] + nums[index] > target){
        continue;
      }
      buckets[i] += nums[index];
      boolean result = backtrack(nums,  index + 1, buckets, target);
      if(result){
        return true;
      }
      buckets[i] -= nums[index];
    }
    return false;
  }
}
