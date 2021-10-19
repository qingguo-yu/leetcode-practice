package org.leetcode.problems.p652;

import org.leetcode.problems.utils.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    HashMap<String, Integer> memo = new HashMap<>();
    LinkedList<TreeNode> res = new LinkedList<TreeNode>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }

    private String traverse(TreeNode root) {
        if (root == null) {
            return "#";
        }
        String left = traverse(root.left);
        String right = traverse(root.right);
        String subTree = left + "," + right + "," + String.valueOf(root.val);
        int count = memo.getOrDefault(subTree, 0);
        if (count == 1) {
            res.add(root);
        }
        else {
            memo.put(subTree, count + 1);
        }
        return subTree;
    }
}
