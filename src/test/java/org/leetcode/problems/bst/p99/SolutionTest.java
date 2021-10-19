package org.leetcode.problems.bst.p99;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void recoverTree() {
        Integer[] array = new Integer[]{1,3,null,null,2};
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(array);
        new Solution().recoverTree(root);
        Integer[] result = Utils.BFSTraverse2ArrayWithNull(root);
        Integer[] expect = new Integer[]{3, 1,null, null, 2};
        Assertions.assertArrayEquals(expect, result);
    }
}