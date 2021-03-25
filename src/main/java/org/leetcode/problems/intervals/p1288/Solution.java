package org.leetcode.problems.intervals.p1288;

import java.util.Arrays;

public class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        int res = 0;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            else {
                return a[0] - b[0];
            }
        });
        int left = intervals[0][0];
        int right = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int[] intv = intervals[i];
            if (left <= intv[0] && right >= intv[1]) {
                res ++;
            }
            if (right >= intv[0] && right <= intv[1]) {
                right = intv[1];
            }
            if (right < intv[0]) {
                left = intv[0];
                right = intv[1];
            }
        }
        return intervals.length - res;
    }
}
