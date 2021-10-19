package org.leetcode.problems.p114;

import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void flatten() {
        Integer[] input = new Integer[]{1,2,5,3,4,null,6};
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(input);
        new Solution1().flatten(root);
    }
}