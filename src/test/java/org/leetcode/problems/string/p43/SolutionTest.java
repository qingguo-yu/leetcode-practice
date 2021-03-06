package org.leetcode.problems.string.p43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void multiply() {
        String num1 = "2", num2 = "3";
        String result = new Solution().multiply(num1, num2);
        Assertions.assertEquals("6", result);
    }

    @Test
    void multiply_() {
        String num1 = "123", num2 = "456";
        String result = new Solution().multiply(num1, num2);
        Assertions.assertEquals("56088", result);
    }
}