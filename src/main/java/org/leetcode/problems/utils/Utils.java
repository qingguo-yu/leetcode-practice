package org.leetcode.problems.utils;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Utils {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode buildTreeFromArray(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array2Tree(array, null, 0);
    }

    private static TreeNode array2Tree(Integer[] array, TreeNode root, int i) {
        if(i >= array.length || array[i] == null){
            return null;
        }
        if(array[i] != null){
            TreeNode temp =  new TreeNode(array[i]);
            root = temp;
            root.left = array2Tree(array,root.left,2*i+1);
            root.right = array2Tree(array,root.right,2*i+2);
        }

        return root;
    }

    public static Integer[] BFSTraverse2Array(TreeNode root){
        if(root == null){
            return new Integer[0];
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            list.add(cur.val);
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }
        return  list.toArray(new Integer[0]);
    }

    public static ListNode buildListFromArray(Integer[] vals) {
        if (vals == null || vals.length == 0) {
            return null;
        }
        ListNode head = new ListNode(vals[0]);
        ListNode cur = head;
        for(int i = 1; i < vals.length; i++){
            cur.next = new ListNode(vals[i]);
            cur = cur.next;
        }
        return head;
    }

    public static Integer[] buildArrayFromList(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> vals = new ArrayList<>();
        while (head != null) {
            vals.add(head.val);
            head = head.next;
        }
        return vals.toArray(new Integer[0]);
    }
}
