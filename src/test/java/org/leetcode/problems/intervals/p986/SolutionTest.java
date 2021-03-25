package org.leetcode.problems.intervals.p986;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void intervalIntersection() {
        int[][] firstList = new int[][]{{0,2},{5,10},{13,23},{24,25}}, secondList = new int[][] {{1,5},{8,12},{15,24},{25,26}};
        int[][] res = new Solution().intervalIntersection(firstList, secondList);
        Assertions.assertArrayEquals(new int[][]{{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}}, res);
    }
}