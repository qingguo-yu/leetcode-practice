package org.leetcode.problems.p106;

import org.leetcode.problems.utils.TreeNode;

public class Solution1 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0) {
            return null;
        }
        int n = inorder.length - 1;
        return _buildTree(inorder, 0, n, postorder, 0, n);
    }

    private TreeNode _buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd) {
            return null;
        }
        int rootVal = postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootIndex) {
                rootIndex = i;
                break;
            }
        }
        int leftSize = rootIndex - inStart;
        root.left = _buildTree(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSize - 1 );
        root. right = _buildTree(inorder, rootIndex + 1, inEnd, postorder, postStart + leftSize , postEnd - 1 );;
        return root;
    }
}
