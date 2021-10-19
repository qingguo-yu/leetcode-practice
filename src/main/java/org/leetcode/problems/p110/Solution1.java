package org.leetcode.problems.p110;

import org.leetcode.problems.utils.TreeNode;

public class Solution1 {
  public boolean isBalanced(TreeNode root) {
    return dfsHeight(root) != -1;
  }
  private int dfsHeight(TreeNode root){
    if(root == null) return 0;
    int h1 = dfsHeight(root.left);
    if(h1 == -1 ) return -1;
    int h2 = dfsHeight(root.right);
    if(h2 == -1) return -1;
    if(Math.abs(h1 - h2) > 1) return -1;
    return  Math.max(h1, h2) + 1;
  }
}
