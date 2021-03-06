package org.leetcode.problems.bt.p297;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

class Solution2Test {

    @Test
    void serialize() {
        Integer[] array = new Integer[] {4,2,7,1,3};
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(array);
        String s = new BfSolution().serialize(root);
        String expect = "4,2,7,1,3,#,#,#,#,#,#,";
        Assertions.assertEquals(expect, s);
    }

    @Test
    void deserialize() {
        String s = "4,2,7,1,3,#,#,#,#,#,#,";
        TreeNode root = new BfSolution().deserialize(s);
        Integer[] array = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[] {4,2,7,1,3};
        Assertions.assertArrayEquals(expect, array);
    }
}