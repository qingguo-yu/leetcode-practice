package org.leetcode.problems.p35;

public class Soluton {
  public int searchInsert(int[] nums, int target) {
    int l = 0, r = nums.length;
    while(l < r){
      int mid = l + (r - l) / 2;
      if(nums[mid] == target ) {
        return mid;
      }
      else if(nums[mid] > target){
        r = mid;
      }
      else {
        l = mid + 1;
      }
    }
    return l;
  }
}
