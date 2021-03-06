package org.leetcode.problems.bfs.p111;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.Utils;
import org.leetcode.problems.utils.TreeNode;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        Integer[] testdata = new Integer[]{3,9, 20,null,null,15,7};
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(testdata);

        int result = new Solution().minDepth(root);
        Assertions.assertEquals(2,  result);
    }
}
