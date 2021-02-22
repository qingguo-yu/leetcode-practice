package org.leetcode.problems.p98;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValidBST() {
        Integer[] array = new Integer[] {2,1,3};
        Utils.TreeNode root = Utils.buildTreeFromArray(array);
        boolean result = new Solution().isValidBST(root);
        Assertions.assertEquals(true, result);
    }
    @Test
    void isValidBST_singleNode() {
        Integer[] array = new Integer[] {2};
        Utils.TreeNode root = Utils.buildTreeFromArray(array);
        boolean result = new Solution().isValidBST(root);
        Assertions.assertEquals(true, result);
    }
    @Test
    void isValidBST_null() {
        boolean result = new Solution().isValidBST(null);
        Assertions.assertEquals(true, result);
    }
    @Test
    void isValidBST_invalid() {
        Integer[] array = new Integer[] {5,1,4,null,null,3,};
        Utils.TreeNode root = Utils.buildTreeFromArray(array);
        boolean result = new Solution().isValidBST(root);
        Assertions.assertEquals(false, result);
    }
}