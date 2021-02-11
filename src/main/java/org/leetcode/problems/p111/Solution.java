package org.leetcode.problems.p111;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int minDepth(TreeNode root) {
        int depth = 0;
        if(root == null) return depth;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        depth = 1;
        while(!queue.isEmpty()){
            int sz = queue.size();
            for(int i = 0; i < sz; i ++){
                TreeNode cur = queue.poll();
                if(cur.left == null && cur.right == null){
                    return depth;
                }
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            depth ++;
        }
        return depth;
    }
}
