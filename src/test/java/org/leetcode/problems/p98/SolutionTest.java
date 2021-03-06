package org.leetcode.problems.p98;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

class SolutionTest {

    @Test
    void isValidBST() {
        Integer[] array = new Integer[] {2,1,3};
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(array);
        boolean result = new Solution().isValidBST(root);
        Assertions.assertEquals(true, result);
    }
    @Test
    void isValidBST_singleNode() {
        Integer[] array = new Integer[] {2};
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(array);
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
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(array);
        boolean result = new Solution().isValidBST(root);
        Assertions.assertEquals(false, result);
    }
}