package org.leetcode.problems.backtracking.p698;

public class Solution2 {
  public boolean canPartitionKSubsets(int[] nums, int k) {
    // 排除一些基本情况
    if (k > nums.length) return false;
    int sum = 0;
    for (int v : nums) sum += v;
    if (sum % k != 0) return false;

    boolean[] used = new boolean[nums.length];
    int target = sum / k;
    for(int i = 0; i < k; i ++){
      boolean tmpResult = backtrack(0, nums, 0, used, target);
      if(tmpResult) continue;
      return false;
    }
    return true;
  }

  boolean backtrack( int bucket,
      int[] nums, int start, boolean[] used, int target) {

    // 从 start 开始向后探查有效的 nums[i] 装入当前桶
    for (int i = start; i < nums.length; i++) {
      // 剪枝
      if (used[i]) {
        // nums[i] 已经被装入别的桶中
        continue;
      }
      if (nums[i] + bucket > target) {
        // 当前桶装不下 nums[i]
        continue;
      }
      // 做选择，将 nums[i] 装入当前桶中
      used[i] = true;
      bucket += nums[i];
      // 递归穷举下一个数字是否装入当前桶
      if (backtrack(bucket, nums, i + 1, used, target)) {
        return true;
      }
      // 撤销选择
      used[i] = false;
      bucket -= nums[i];
    }
    // 穷举了所有数字，都无法装满当前桶
    return false;
  }
}
