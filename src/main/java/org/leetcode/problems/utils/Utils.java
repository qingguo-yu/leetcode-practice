package org.leetcode.problems.utils;


import java.util.*;

public class Utils {

    public static TreeNode buildTreeFromArrayOfLevelOrder(Integer[] array) {
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

    public static Integer[] BFSTraverse2ArrayWithNull(TreeNode root){
        if(root == null){
            return new Integer[0];
        }
        LinkedList<Integer> list = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();

            if (cur != null) {
                list.add(cur.val);
                q.offer(cur.left);
                q.offer(cur.right);
            }
            else {
                list.add(null);
            }

        }
        while(list.getLast() == null){
            list.removeLast();
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

    public static ListNode buildListWithLoopFromArray(int[] vals, int pos) {
        if (vals == null || vals.length == 0) {
            return null;
        }
        ListNode head = new ListNode(vals[0]);
        ListNode cur = head;
        ListNode posNode = null;
        if (pos == 0) {
            posNode = head;
        }
        for(int i = 1; i < vals.length; i++){
            cur.next = new ListNode(vals[i]);
            cur = cur.next;
            if(i == pos) posNode = cur;

        }
        cur.next = posNode;
        return head;
    }
}
