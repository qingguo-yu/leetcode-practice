package org.leetcode.problems.intervals.p56;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void merge() {
        int[][] intervals = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] res = new Solution().merge(intervals);
        Assertions.assertArrayEquals(new int[][]{{1,6},{8,10},{15,18}}, res);
    }
}