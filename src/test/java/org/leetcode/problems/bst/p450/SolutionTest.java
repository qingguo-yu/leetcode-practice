package org.leetcode.problems.bst.p450;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.Utils;

class SolutionTest {

    @Test
    void deleteNode() {
        Integer[] array = new Integer[] {5,3,6,2,4,null,7};
        Utils.TreeNode root = Utils.buildTreeFromArray(array);
        root = new Solution().deleteNode(root, 0);
        Integer[] actual = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[] {5,3,6,2,4,7};
        Assertions.assertArrayEquals(expect, actual);


    }
    @Test
    void deleteNode_delete_3() {
        Integer[] array = new Integer[] {5,3,6,2,4,null,7};
        Utils.TreeNode root = Utils.buildTreeFromArray(array);
        root = new Solution().deleteNode(root, 3);
        Integer[] actual = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[] {5,4,6,2,7};
        Assertions.assertArrayEquals(expect, actual);
    }
    @Test
    void deleteNode_delete_0() {
        Integer[] array = new Integer[0] ;
        Utils.TreeNode root = Utils.buildTreeFromArray(array);
        root = new Solution().deleteNode(root, 0);
        Integer[] actual = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[0];
        Assertions.assertArrayEquals(expect, actual);
    }
}