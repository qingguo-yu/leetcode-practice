package org.leetcode.problems.p106;

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || inorder.length == 0) return null;
        return _buildTree(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private TreeNode _buildTree(int[] postorder, int postStart,int postEnd,  int[] inorder, int inStart, int inEnd){
        if(postStart > postEnd) return null;
        int rootVal = postorder[postEnd];
        int index = 0;
        for(int i = inStart; i <= inEnd; i++ ){
            if(inorder[i] ==  rootVal){
                index = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        int leftSize  = index - inStart;
        root.left = _buildTree(postorder, postStart , postStart + leftSize -1 , inorder, inStart,index - 1);
        root.right = _buildTree(postorder,postStart + leftSize , postEnd - 1, inorder, index + 1, inEnd);
        return root;
    }
}
