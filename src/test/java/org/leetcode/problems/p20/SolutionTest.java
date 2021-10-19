package org.leetcode.problems.p20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid() {
        String s = "([]{})";
        boolean isValid = new Solution().isValid(s);
        Assertions.assertTrue(isValid);
    }

    @Test
    void isValidWithInvalidString() {
        String s = "([]{)";
        boolean isValid = new Solution().isValid(s);
        Assertions.assertTrue(isValid);
    }
}