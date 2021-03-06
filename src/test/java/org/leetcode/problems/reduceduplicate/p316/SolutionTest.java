package org.leetcode.problems.reduceduplicate.p316;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeDuplicateLetters() {
        String s = "bcabc";
        String result = new Solution().removeDuplicateLetters(s);
        Assertions.assertEquals("abc", result);
    }
}