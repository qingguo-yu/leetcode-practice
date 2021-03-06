package org.leetcode.problems.bt.p297;

import org.leetcode.problems.utils.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution1 {

    // Encodes a tree to a single string.
    private StringBuilder sb = new StringBuilder();
    private static final String SEPERATOR = ",";
    public String serialize(TreeNode root) {
        if (root == null) {
            sb.append("#").append(SEPERATOR);
            return "";
        }
        serialize(root.left);
        serialize(root.right);
        sb.append(root.val).append(SEPERATOR);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }

        String[] vals = data.split(SEPERATOR);
        LinkedList<String> nodes = new LinkedList<>(Arrays.asList(vals));
        return deserialize( nodes);
    }
    private TreeNode deserialize(LinkedList<String> nodes) {
        if (nodes.isEmpty()) {
            return null;
        }
        String first = nodes.removeLast();
        if (first.equals("#")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(first));
        root.right = deserialize(nodes);
        root.left = deserialize(nodes);
        return root;
    }
    int index = 0;
    public TreeNode deserialize1(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }

        String[] vals = data.split(SEPERATOR);
        index = vals.length - 1;
        return deserialize( vals);
    }
    private TreeNode deserialize(String[] nodes) {
        if (index < 0 )  {
            return null;
        }
        String val = nodes[index--];
        if (val.equals("#")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(val));
        root.right = deserialize(nodes);
        root.left = deserialize(nodes);
        return root;
    }

}
