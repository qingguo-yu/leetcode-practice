package org.leetcode.problems.p111;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p111.Solution;
import org.leetcode.problems.p111.Solution.TreeNode;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        TreeNode root = new TreeNode(1);
        TreeNode tmp = new TreeNode(2);
        root.left = tmp;
        tmp = new TreeNode(3);
        root.right = tmp;
        tmp = new TreeNode(4);
        root.left.left = tmp;

        int result = new Solution().minDepth(root);
        Assertions.assertEquals(2,  result);
    }
}