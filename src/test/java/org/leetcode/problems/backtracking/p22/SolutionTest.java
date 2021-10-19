package org.leetcode.problems.backtracking.p22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void generateParenthesis() {
        int n = 2;
        List<String> result = new Solution().generateParenthesis(n);
        List<String> expect = Arrays.asList("()");
        Assertions.assertEquals(expect, result);
    }
}