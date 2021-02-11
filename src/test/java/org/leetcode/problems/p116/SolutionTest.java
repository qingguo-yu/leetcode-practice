package org.leetcode.problems.p116;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p116.Solution.Node;

public class SolutionTest {

    @Test
    public void SolutionTest(){
        Node root = new Node(1);
        Node node = new Node(2);
        root.left = node;
        node = new Node(3);
        root.right = node;
        node = new Node(4);
        root.left.left = node;
        node = new Node(5);
        root.left.right = node;
        node = new Node(6);
        root.right.left = node;
        node = new Node(7);
        root.right.right = node;
        new Solution().connect(root);
        Assertions.assertEquals(6, root.left.right.next.val);
    }


}
