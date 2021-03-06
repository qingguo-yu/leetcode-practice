package org.leetcode.problems.dp.p509;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int fib(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int fib = 2, fib_1 = 1, fib_2 = 1;
        for (int i = 3; i <= n; i++) {
            fib = fib_1 + fib_2;
            fib_2 = fib_1;
            fib_1 = fib;
        }
        return fib;
    }
}
