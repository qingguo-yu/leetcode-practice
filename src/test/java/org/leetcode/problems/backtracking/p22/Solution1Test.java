package org.leetcode.problems.backtracking.p22;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution1Test {

    @Test
    void generateParenthesis() {
        int n = 2;
        List<String> result = new Solution1().generateParenthesis(n);
        List<String> expect = Arrays.asList("(())", "()()");
        Assertions.assertEquals(expect, result);
    }
}