package org.leetcode.problems.p110;

import org.leetcode.problems.utils.TreeNode;

public class Solution {
  public boolean isBalanced(TreeNode root) {
    if(root == null) return true;
    if(!isBalanced(root.left)) return false;
    if(!isBalanced(root.right)) return false;
    int h1 = getHeight(root.left);
    int h2 = getHeight(root.right);
    if( Math.abs(h1 - h2) <= 1) return true;
    return false;

  }
  private int getHeight(TreeNode root){
    if(root == null) return 0;
    int h1 = getHeight(root.left);
    int h2 = getHeight(root.right);
    return  Math.max(h1, h2) + 1;
  }
}
