package org.leetcode.problems.utils;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class UtilsTest {


    @Test
    public void testbuildTreeFromArray(){
        Integer[] array = new Integer[] {4,1,6,0,2,5,7,null,null,null,3,null,null,null,8};
        Utils.TreeNode root = Utils.buildTreeFromArray(array);
//        preOrderTraverse(root);
        BFSTraverse(root);
    }

    private void preOrderTraverse(Utils.TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    private void BFSTraverse(Utils.TreeNode root){
        if(root == null){
            return;
        }
        Queue<Utils.TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Utils.TreeNode cur = q.poll();
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
