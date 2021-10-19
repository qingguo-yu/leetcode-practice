package org.leetcode.problems.p114;

import org.leetcode.problems.utils.TreeNode;

public class Solution1 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode leftTail = root.left;
        while(leftTail!= null && leftTail.right != null){
            leftTail = leftTail.right;
        }
        if (leftTail != null) {
            leftTail.right = root.right;
            root.right = root.left;
        }

        root.left = null;
    }
}
