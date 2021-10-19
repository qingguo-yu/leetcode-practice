package org.leetcode.problems.p110;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

class Solution1Test {

  @Test
  void isBalanced() {
    Integer[] array = new Integer[]{3, 9, 20, null, null, 15, 7};
    TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(array);
    boolean result = new Solution1().isBalanced(root);
    Assertions.assertTrue(result);
  }
}