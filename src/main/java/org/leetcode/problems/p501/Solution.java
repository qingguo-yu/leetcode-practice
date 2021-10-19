package org.leetcode.problems.p501;

import org.leetcode.problems.utils.TreeNode;

public class Solution {
  private int currVal;
  private int currCount;
  private int maxCount;
  private int modeCount;
  private int[] modes;

  public int[] findMode(TreeNode root) {
    inorder(root);
    modes = new int[modeCount];
    modeCount = 0;
    currCount = 0;
    inorder(root);
    return modes;
  }
  private void inorder(TreeNode root){
    if(root == null) return;
    inorder(root.left);
    handleValue(root.val);
    inorder(root.right);
  }
  private void handleValue(int value){
    if(value != currVal){
      currVal = value;
      currCount = 0;
    }
    currCount ++;
    if(currCount > maxCount){
      maxCount = currCount;
      modeCount = 1;
    }
    else if(currCount == maxCount){
      if(modes != null) modes[modeCount] = currVal;
      modeCount ++;
    }
  }

}
