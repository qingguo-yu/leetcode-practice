package org.leetcode.problems.bt.p297;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void serialize() {
        Integer[] array = new Integer[] {4,2,7,1,3};
        Utils.TreeNode root = Utils.buildTreeFromArray(array);
        String s = new Solution1().serialize(root);
        String expect = "#,#,1,#,#,3,2,#,#,7,4,";
        Assertions.assertEquals(expect, s);
    }

    @Test
    void deserialize() {
        String s = "#,#,1,#,#,3,2,#,#,7,4,";
        Utils.TreeNode root = new Solution1().deserialize(s);
        Integer[] array = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[] {4,2,7,1,3};
        Assertions.assertArrayEquals(expect, array);
    }

    @Test
    void deserialize1() {
        String s = "#,#,1,#,#,3,2,#,#,7,4,";
        Utils.TreeNode root = new Solution1().deserialize1(s);
        Integer[] array = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[] {4,2,7,1,3};
        Assertions.assertArrayEquals(expect, array);
    }
}