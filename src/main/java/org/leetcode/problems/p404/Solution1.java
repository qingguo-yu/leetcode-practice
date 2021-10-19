package org.leetcode.problems.p404;

import java.util.Stack;
import org.leetcode.problems.utils.TreeNode;

public class Solution1 {
  private int sum;
  public int sumOfLeftLeaves(TreeNode root) {
    if(root == null) return 0;
    int ans = 0;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      if (node.left != null) {
        if (node.left.left == null && node.left.right == null) {
          ans += node.left.val;
        }
        else {
          stack.push(node.left);
        }
      }
      if (node.right != null && (node.right.left != null || node.right.right != null)) {
        stack.push(node.right);
      }
    }

    return ans;
  }
}
