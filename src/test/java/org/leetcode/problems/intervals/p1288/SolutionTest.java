package org.leetcode.problems.intervals.p1288;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeCoveredIntervals() {
        int[][] intervals = new int[][]{{1,4},{3,6},{2,8}};
        int res = new Solution().removeCoveredIntervals(intervals);
        Assertions.assertEquals(2, res);
    }
}