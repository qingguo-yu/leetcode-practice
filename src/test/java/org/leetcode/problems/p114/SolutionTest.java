package org.leetcode.problems.p114;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p114.Solution;
import org.leetcode.problems.p114.Solution.TreeNode;

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

       new Solution().flatten(root);
        Assertions.assertEquals(3,  root.right.right.right.val);
    }
}
