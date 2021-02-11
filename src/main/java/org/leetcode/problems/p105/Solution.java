package org.leetcode.problems.p105;

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || preorder.length == 0) return null;
        return _buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private TreeNode _buildTree(int[] preorder, int preStart,int preEnd,  int[] inorder, int inStart, int inEnd){
        if(preStart > preEnd) return null;
        int rootVal = preorder[preStart];
        int index = 0;
        for(int i = inStart; i <= inEnd; i++ ){
            if(inorder[i] ==  rootVal){
                index = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        int leftSize  = index - inStart;
        root.left = _buildTree(preorder, preStart + 1, preStart + leftSize  , inorder, inStart,index - 1);
        root.right = _buildTree(preorder,preStart + leftSize + 1, preEnd, inorder, index + 1, inEnd);
        return root;
    }
}
