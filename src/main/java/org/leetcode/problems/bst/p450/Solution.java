package org.leetcode.problems.bst.p450;

import org.leetcode.problems.utils.Utils.TreeNode;

public class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            TreeNode minNode = getMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);

        } else if (root.val > key) {
            // 去左子树找
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            // 去右子树找
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
    private TreeNode getMin(TreeNode root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

}
