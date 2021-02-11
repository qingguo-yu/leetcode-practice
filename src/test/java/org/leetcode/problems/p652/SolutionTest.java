package org.leetcode.problems.p652;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p652.Solution;
import org.leetcode.problems.p652.Solution.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
        List<TreeNode> result = new Solution().findDuplicateSubtrees(root);
        Assertions.assertEquals(new ArrayList<TreeNode>(),  result);
        tmp = new TreeNode(4);
        root.right.left = tmp;
        result = new Solution().findDuplicateSubtrees(root);
        List<TreeNode> expect = new ArrayList<TreeNode>();
        expect.add(tmp);
        Assertions.assertEquals(expect,  result);
    }
}
