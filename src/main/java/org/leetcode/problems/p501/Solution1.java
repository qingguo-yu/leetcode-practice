package org.leetcode.problems.p501;

import java.util.ArrayList;
import java.util.List;
import org.leetcode.problems.utils.TreeNode;

public class Solution1 {
  private int currVal;
  private int currCount;
  private int maxCount;

  private List<Integer> list = new ArrayList<>();

  public int[] findMode(TreeNode root) {
    inorder(root);
    int[] modes = new int[list.size()];
    for(int i = 0; i < modes.length; i ++){
      modes[i] = list.get(i);
    }
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
      list.clear();
      list.add(currVal);
    }
    else if(currCount == maxCount){
      list.add(currVal);
    }
  }

}
