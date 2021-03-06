package org.leetcode.problems.bst.p701;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

class SolutionTest {

    @Test
    void insertIntoBST() {
        Integer[] array = new Integer[] {4,2,7,1,3};
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(array);
        TreeNode newRoot = new Solution().insertIntoBST(root, 5);
        Integer[] result = Utils.BFSTraverse2Array(newRoot);
        Integer[] expect = new Integer[]{4,2,7,1,3,5};
        Assertions.assertArrayEquals(expect, result);
    }
}