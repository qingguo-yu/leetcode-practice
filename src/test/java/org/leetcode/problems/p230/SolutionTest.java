package org.leetcode.problems.p230;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p230.Solution;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        Solution.TreeNode root = new Solution.TreeNode(3);
        Solution.TreeNode tmp = new Solution.TreeNode(2);
        root.left = tmp;
        tmp = new Solution.TreeNode(4);
        root.right = tmp;
        tmp = new Solution.TreeNode(1);
        root.left.left = tmp;
        int res = new Solution().kthSmallest(root, 1);
        Assertions.assertEquals(1, res);
        res = new Solution().kthSmallest(root, 4);
        Assertions.assertEquals(4, res);
        res = new Solution().kthSmallest(root, 3);
        Assertions.assertEquals(3, res);
    }
}
