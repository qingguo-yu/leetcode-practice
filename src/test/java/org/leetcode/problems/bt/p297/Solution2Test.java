package org.leetcode.problems.bt.p297;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    void serialize() {
        Integer[] array = new Integer[] {4,2,7,1,3};
        Utils.TreeNode root = Utils.buildTreeFromArray(array);
        String s = new Solution2().serialize(root);
        String expect = "4,2,7,1,3,#,#,#,#,#,#,";
        Assertions.assertEquals(expect, s);
    }

    @Test
    void deserialize() {
        String s = "4,2,7,1,3,#,#,#,#,#,#,";
        Utils.TreeNode root = new Solution2().deserialize(s);
        Integer[] array = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[] {4,2,7,1,3};
        Assertions.assertArrayEquals(expect, array);
    }
}