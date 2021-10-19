package org.leetcode.problems.p116;

import org.leetcode.problems.p116.Solution.Node;

import java.util.LinkedList;

public class Solution3 {
    public Node connect(Node root) {
        if(root == null || root.left == null) return root;
        root.left.next = root.right;
        if (root.next != null) {
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

}
