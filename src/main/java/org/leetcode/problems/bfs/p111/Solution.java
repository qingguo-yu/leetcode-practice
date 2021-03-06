package org.leetcode.problems.bfs.p111;

import org.leetcode.problems.utils.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
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
