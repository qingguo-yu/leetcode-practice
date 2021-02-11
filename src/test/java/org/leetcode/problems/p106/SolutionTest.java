package org.leetcode.problems.p106;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p106.Solution;
import org.leetcode.problems.p106.Solution.TreeNode;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        int[] postorder = new int[]{9,15,7,20,3};
        int[] inorder = new int[]{9,3,15,20,7};
        TreeNode root = new Solution().buildTree(inorder, postorder);
        Assertions.assertEquals(9,  root.left.val);
        Assertions.assertEquals(20,  root.right.val);
    }
}
