package org.leetcode.problems.p700;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchBST() {
        Integer[] array = new Integer[] {4,2,7,1,3};
        Utils.TreeNode root = Utils.buildTreeFromArray(array);
        Utils.TreeNode result = new Solution().searchBST(root, 2);
        Integer[] array1 = Utils.BFSTraverse2Array(result);
        Integer[] expect = new Integer[]{2,1,3};
        Assertions.assertArrayEquals(expect, array1);
    }
}