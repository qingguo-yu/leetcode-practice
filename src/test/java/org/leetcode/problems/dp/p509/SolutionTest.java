package org.leetcode.problems.dp.p509;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void fib() {
        int n = 3;
        int result = new Solution().fib(n);
        Assertions.assertEquals(2, result);
    }

    @Test
    void fib_2() {
        int n = 2;
        int result = new Solution().fib(n);
        Assertions.assertEquals(1, result);
    }
    @Test
    void fib_4() {
        int n = 4;
        int result = new Solution().fib(n);
        Assertions.assertEquals(3, result);
    }
}