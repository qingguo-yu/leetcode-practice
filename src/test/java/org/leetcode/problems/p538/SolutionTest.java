package org.leetcode.problems.p538;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.Utils;
import org.leetcode.problems.utils.Utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void conertBST() {
        Integer[] array = new Integer[] {4,1,6,0,2,5,7,null,null,null,3,null,null,null,8};
        TreeNode root = Utils.buildTreeFromArray(array);
        new Solution().convertBST(root);
        Integer[] result = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[]{30, 36, 21, 36, 35, 26, 15, 33, 8};
        Assertions.assertArrayEquals(expect, result);
    }
}