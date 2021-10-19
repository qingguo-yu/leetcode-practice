package org.leetcode.problems.p654;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void constructMaximumBinaryTree() {
        int[] nums = new int[]{3,2,1,6,0,5};
        TreeNode root = new Solution1().constructMaximumBinaryTree(nums);
        Integer[] array = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[]{6, 3,5, 2, 0, 1};
        Assertions.assertArrayEquals(expect, array);
    }
}