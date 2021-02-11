package org.leetcode.problems.p654;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p654.Solution;
import org.leetcode.problems.p654.Solution.TreeNode;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        int[] nums = new int[] {3,2,1};
        TreeNode newRoot = new Solution().constructMaximumBinaryTree(nums);
        Assertions.assertEquals(1,  newRoot.right.right.val);
    }
}
