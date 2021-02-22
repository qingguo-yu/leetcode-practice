package org.leetcode.problems.bst.p700;

import org.leetcode.problems.utils.Utils.TreeNode;

public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val < val) {
            return searchBST(root.right, val);
        }
        if(root.val > val )
            return searchBST(root.left, val);
        return root;
    }

}
