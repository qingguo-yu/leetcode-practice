package org.leetcode.problems.p501;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

class SolutionTest {

  @Test
  void findMode() {
    Integer[] nums = {1};
    TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(nums);
    int[] result = new Solution().findMode(root);
    Assertions.assertArrayEquals(new int[]{1}, result);
  }
}