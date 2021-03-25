package org.leetcode.problems.list.p234;

import org.leetcode.problems.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Integer[] array = list.toArray(new Integer[list.size()]);
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i++] != array[j--]) {
                return false;
            }
        }
        return true;
    }
}
