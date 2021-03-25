package org.leetcode.problems.bt.p236;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.TreeNode;
import org.leetcode.problems.utils.Utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lowestCommonAncestor() {
        Integer[] vals = new Integer[]{3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(vals);
        List<TreeNode> list = getTreeNode(root, 5, 1);
        TreeNode res = new Solution().lowestCommonAncestor(root, list.get(0), list.get(1));
        Assertions.assertEquals(3, res.val);
    }

    private List<TreeNode> getTreeNode(TreeNode root, int val1, int val2) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<TreeNode> res = new ArrayList<>();
        while(!queue.isEmpty() && res.size() != 2){
            TreeNode cur = queue.poll();
            if (cur.val == val1 || cur.val == val2) {
                res.add(cur);
            }
            if(cur.left != null){
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }

        }
        return res;
    }
}