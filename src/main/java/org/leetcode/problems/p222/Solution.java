package org.leetcode.problems.p222;

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
    }
    public int countNodes(TreeNode root) {
        TreeNode l = root, r = root;
        int hl = 0, hr = 0;
        while (l != null) {
            l = l.left;
            hl ++;
        }
        while (r != null) {
            r = r.right;
            hr ++;
        }
        if (hl == hr) {
            return (int) Math.pow(2, hl) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}
