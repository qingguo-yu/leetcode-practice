package org.leetcode.problems.p404;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

class SolutionTest {

  @Test
  void sumOfLeftLeaves() {
    Integer[] array = new Integer[]{3,9,20,null,null,15,7};
    TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(array);
    int result = new Solution().sumOfLeftLeaves(root);
    Assertions.assertEquals(24, result);
    result = new Solution1().sumOfLeftLeaves(root);
    Assertions.assertEquals(24, result);
  }
}