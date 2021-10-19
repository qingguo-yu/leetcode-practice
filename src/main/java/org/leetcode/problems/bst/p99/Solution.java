package org.leetcode.problems.bst.p99;

import org.leetcode.problems.utils.TreeNode;

public class Solution {

    TreeNode left = null;
    TreeNode right = null;
    TreeNode last = null;
    public void recoverTree(TreeNode root) {
        dfs(root);
        int tmp = left.val;
        left.val = right.val;
        right.val = tmp;
    }
    private void dfs(TreeNode root){
        if(root == null) return;

        dfs(root.left);
        if(last != null && left == null && last.val > root.val) left = last;
        if(last != null && last.val > root.val) right = root;
        last = root;
        dfs(root.right);
    }
}
