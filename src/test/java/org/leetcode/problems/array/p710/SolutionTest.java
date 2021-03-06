package org.leetcode.problems.array.p710;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void pick() {
        Solution s = new Solution(1, new int[0]);
        Assertions.assertEquals(0, s.pick());
        Assertions.assertEquals(0, s.pick());
    }
    @Test
    void pick_2() {
        Solution s = new Solution(2, new int[0]);
        Assertions.assertEquals(1, s.pick());
        Assertions.assertEquals(0, s.pick());
    }
}