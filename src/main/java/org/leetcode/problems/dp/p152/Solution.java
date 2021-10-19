package org.leetcode.problems.dp.p152;

//Time limit exceed
public class Solution {
  public int maxProduct(int[] nums) {
    int max = Integer.MIN_VALUE;
    int n = nums.length;
    for (int start = 0; start < n; start++) { //start of subarray
      for (int end = start; end < n; end++) {//end of subarray
        int tmp = 1;
        for (int k = start; k <= end; k++) {
          tmp *= nums[k];
        }
        max = max < tmp ? tmp : max;
      }
    }
    return max;
  }
}
