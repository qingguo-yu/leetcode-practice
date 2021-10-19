package org.leetcode.problems.p105;

import org.leetcode.problems.utils.TreeNode;

public class Solution1 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        int n = preorder.length;
        return _build(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    private TreeNode _build(int[] preorder, int pStart, int pEnd, int[] inorder, int iStart, int iEnd) {
        //return condition
        if (pStart > pEnd) {
            return null;
        }
        //build root
        int rootVal = preorder[pStart];
        TreeNode root = new TreeNode(rootVal);
        //find index of root value in inOrder, then find end of left child tree  and start of right child tree
        int rootIndex = iStart;
        for (int i = iStart; i <= iEnd; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        int leftSize = rootIndex - iStart;
        // left child tree
        root.left = _build(preorder, pStart + 1, pStart + leftSize, inorder, iStart , rootIndex - 1);
        // right child tree
        root.right = _build(preorder, pStart + leftSize + 1, pEnd, inorder, rootIndex + 1 , iEnd);
        //return root
        return root;
    }
}
