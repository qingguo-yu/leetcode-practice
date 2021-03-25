package org.leetcode.problems.bt.p236;

import org.leetcode.problems.utils.TreeNode;

import java.util.*;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        stack.push(root);
        parent.put(root, null);
        while (!parent.containsKey(p) || !parent.containsKey(q)) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                stack.push(node.left);
                parent.put(node.left, node);
            }
            if (node.right != null) {
                stack.push(node.right);
                parent.put(node.right, node);
            }
        }
        Set<TreeNode> ancestors = new HashSet<>();
        while (p != null) {
            ancestors.add(p);
            p = parent.get(p);
        }

        while (!ancestors.contains(q)) {
            q = parent.get(q);
        }
        return q;
    }
}
