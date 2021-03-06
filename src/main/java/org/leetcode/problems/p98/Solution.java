package org.leetcode.problems.p98;

import org.leetcode.problems.utils.TreeNode;

public class Solution {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max){
        if (root == null) {
            return true;
        }
        if(min != null && min.val >= root.val) return false;
        if (max != null && max.val <= root.val) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

}
