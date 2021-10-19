package org.leetcode.problems.p654;

import org.leetcode.problems.utils.TreeNode;

public class Solution1 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        return _build(nums, 0, nums.length - 1);
    };

    private TreeNode _build(int[] nums, int start, int end) {
        if (end < start) {
            return  null;
        }
        int max = nums[start];
        int maxIndex = start;
        for(int i = start; i >= 0 && i <= end; i ++){
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = _build(nums, start, maxIndex - 1);
        root.right = _build( nums, maxIndex + 1, end);
        return root;
    }

}
