package org.leetcode.problems.p105;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p105.Solution;
import org.leetcode.problems.p105.Solution.TreeNode;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        TreeNode root = new Solution().buildTree(preorder, inorder);
        Assertions.assertEquals(9,  root.left.val);
        Assertions.assertEquals(20,  root.right.val);
    }
}
