package org.leetcode.problems.bt.p297;

import org.leetcode.problems.utils.Utils.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    // Encodes a tree to a single string.
    private StringBuilder sb = new StringBuilder();
    private static final String SEPERATOR = ",";
    public String serialize(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur == null) {
                sb.append("#").append(SEPERATOR);
                continue;
            }
            sb.append(cur.val).append(SEPERATOR);
            q.offer(cur.left);
            q.offer(cur.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }

        String[] vals = data.split(SEPERATOR);
        LinkedList<String> nodes = new LinkedList<>(Arrays.asList(vals));
        TreeNode root = new TreeNode(Integer.valueOf(vals[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int index = 0;
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            index++;
            if (cur == null) {
                continue;
            }
            cur.left = left < vals.length && !vals[left].equals("#") ? new TreeNode( Integer.valueOf(vals[left])) : null;
            cur.right = right < vals.length && !vals[right].equals("#") ? new TreeNode( Integer.valueOf(vals[right])) : null;
            if(cur.left != null){
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }
        return root;
    }

}
