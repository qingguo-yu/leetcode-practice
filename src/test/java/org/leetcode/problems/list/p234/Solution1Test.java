package org.leetcode.problems.list.p234;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.utils.ListNode;
import org.leetcode.problems.utils.Utils;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void isPalindrome() {
        ListNode head = Utils.buildListFromArray(new Integer[]{1, 2, 1});
        boolean res = new Solution1().isPalindrome(head);
        Assertions.assertEquals(true, res);
    }
    @Test
    void isPalindrome_1() {
        ListNode head = Utils.buildListFromArray(new Integer[]{1, 1});
        boolean res = new Solution1().isPalindrome(head);
        Assertions.assertEquals(true, res);
    }
    @Test
    void isPalindrome_invalid() {
        ListNode head = Utils.buildListFromArray(new Integer[]{1, 2});
        boolean res = new Solution1().isPalindrome(head);
        Assertions.assertEquals(false, res);
    }
    @Test
    void isPalindrome_invalid_1() {
        ListNode head = Utils.buildListFromArray(new Integer[]{1, 2,3});
        boolean res = new Solution1().isPalindrome(head);
        Assertions.assertEquals(false, res);
    }
}