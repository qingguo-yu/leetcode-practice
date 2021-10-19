package org.leetcode.problems.p116;

import java.util.Deque;
import java.util.LinkedList;
import org.leetcode.problems.p116.Solution.Node;

public class Solution1 {
    public Node connect(Node root) {
        if(root == null) return null;
        LinkedList<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            Node prev = null;
            for(int i = 0; i < n; i ++){
                Node node = q.poll();
                if (prev != null) {
                    prev.next = node;
                }
                prev = node;

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
        }
        return root;
    }

}
