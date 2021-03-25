package org.leetcode.problems.string.p5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        String s = "babad";
        String res = new Solution().longestPalindrome(s);
        Assertions.assertEquals("aba", res);
    }
}