package org.leetcode.problems.utils;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class UtilsTest {


    @Test
    public void testbuildTreeFromArray(){
        Integer[] array = new Integer[] {4,1,6,0,2,5,7,null,null,null,3,null,null,null,8};
        TreeNode root = Utils.buildTreeFromArrayOfLevelOrder(array);
//        preOrderTraverse(root);
        BFSTraverse(root);
    }

    private void preOrderTraverse(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    private void BFSTraverse(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            System.out.println(cur.val);
            if (cur.left != null) {
                q.offer(cur.left);
            }
            if (cur.right != null) {
                q.offer(cur.right);
            }
        }

    }


}
