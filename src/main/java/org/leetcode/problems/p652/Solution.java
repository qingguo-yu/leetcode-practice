package org.leetcode.problems.p652;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    };
    HashMap<String, Integer> memo = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if(root == null) return null;
        traverse(root);
        return result;
    }
    String traverse(TreeNode root){
        if(root == null) return "#";
        String left = traverse(root.left);
        String right = traverse(root.right);
        String subTree = new StringBuilder().append(left).append(",").append(right).append(",").append(root.val).toString();
        int freq = memo.getOrDefault(subTree, 0);
        if(freq == 1){
            result.add(root);
        }
        memo.put(subTree, freq + 1);
        return subTree;
    }
}
