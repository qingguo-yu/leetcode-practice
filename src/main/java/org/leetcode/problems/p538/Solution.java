package org.leetcode.problems.p538;

import org.leetcode.problems.utils.Utils.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    private int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.right != null) {
            convertBST(root.right);
        }
        root.val += sum;
        sum = root.val;
        if (root.left != null) {
            convertBST(root.left);
        }
        return root;
    }

}
