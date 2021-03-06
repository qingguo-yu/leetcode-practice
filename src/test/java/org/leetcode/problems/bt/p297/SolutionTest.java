package org.leetcode.problems.bt.p297;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

class SolutionTest {

    @Test
    void serialize() {
        Integer[] array = new Integer[] {4,2,7,1,3};
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(array);
        String s = new Solution().serialize(root);
        String expect = "4,2,1,#,#,3,#,#,7,#,#,";
        Assertions.assertEquals(expect, s);
    }

    @Test
    void testDeserialize() {
        String s = "4,2,1,#,#,3,#,#,7,#,#,";
        TreeNode root = new Solution().deserialize(s);
        Integer[] array = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[] {4,2,7,1,3};
        Assertions.assertArrayEquals(expect, array);
    }

    @Test
    void testDeserialize1() {
        String s = "4,2,1,#,#,3,#,#,7,#,#,";
        TreeNode root = new Solution().deserialize1(s);
        Integer[] array = Utils.BFSTraverse2Array(root);
        Integer[] expect = new Integer[] {4,2,7,1,3};
        Assertions.assertArrayEquals(expect, array);
    }
}