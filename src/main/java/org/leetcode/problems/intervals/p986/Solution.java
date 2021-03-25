package org.leetcode.problems.intervals.p986;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList == null || firstList.length == 0 || secondList == null || secondList.length == 0) {
            return new int[0][0];
        }
        int i = 0, j = 0;
        List<int[]> res = new ArrayList<>();
        while (i < firstList.length && j < secondList.length) {
            int a1 = firstList[i][0];
            int a2 = firstList[i][1];
            int b1 = secondList[j][0];
            int b2 = secondList[j][1];
            if (b2 >= a1 && b1 <= a2) {
                res.add(new int[]{Math.max(a1, b1), Math.min(a2, b2)});
            }
            if(b2 < a2){
                j ++;
            }
            else{
               i ++;
            }
        }
        return  res.toArray(new int[res.size()][2]);
    }
}
