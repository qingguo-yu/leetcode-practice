package org.leetcode.problems.array.p344;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseString() {
        char[] input = "hello".toCharArray();
        new Solution().reverseString(input);
        String result = new String(input);
        Assertions.assertEquals("olleh", result);
    }
}