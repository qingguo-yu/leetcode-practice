package org.leetcode.problems.p654;

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return _build(nums, 0, nums.length - 1);
    }
    private TreeNode _build(int[] nums, int start, int end){
        if(nums == null || nums.length == 0) return null;
        if(start > end ) return null;

        int max = Integer.MIN_VALUE;
        int index = start;
        for(int i = start; i <= end; i ++){
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = _build(nums, start, index - 1);
        root.right = _build(nums, index + 1, end);
        return root;
    }

}
