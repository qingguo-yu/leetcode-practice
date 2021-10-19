package org.leetcode.problems.p116;

import org.leetcode.problems.p116.Solution.Node;

import java.util.LinkedList;

public class Solution2 {
    public Node connect(Node root) {
        if(root == null) return null;
        LinkedList<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            while(n-- > 0){
                Node node = q.poll();
                if (n != 0) {
                    node.next = q.peek();
                }

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
