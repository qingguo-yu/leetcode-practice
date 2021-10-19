package org.leetcode.problems.string.p392;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void isSubsequence() {
        String s = "abc", t = "cacbhbc";
        boolean result = new Solution1().isSubsequence(s, t);
        Assertions.assertEquals(true, result);
    }
}