package org.leetcode.problems.string.p392;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSubsequence() {
        String s = "abc", t = "ahbgdc";
        boolean result = new Solution().isSubsequence(s, t);
        Assertions.assertEquals(true, result);
    }
}