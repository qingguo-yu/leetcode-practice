package org.leetcode.problems.p230;

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
    int result = -1;
    int rank = 0;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    void traverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        traverse(root.left, k);
        rank ++;
        if (k == rank) {
            result = root.val;
            return;
        }
        traverse(root.right, k);
    }


}
