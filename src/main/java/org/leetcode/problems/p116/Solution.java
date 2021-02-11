package org.leetcode.problems.p116;

public class Solution {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node next;
        Node(int val) { this.val = val; }
        Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }
    public Node connect(Node root) {
        if(root == null ) return root;
        _connect(root.left, root.right);
        return root;
    }
    private void _connect(Node node1, Node node2){
        if(node1 == null || node2 == null) return;
        node1.next = node2;

        _connect(node1.left, node1.right);
        _connect(node2.left, node2.right);
        _connect(node1.right, node2.left);
    }
}
