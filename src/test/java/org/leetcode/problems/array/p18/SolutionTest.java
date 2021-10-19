package org.leetcode.problems.array.p18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void fourSum() {
        int[] nums = new int[]{1,0,-1,0,-2,2};
        List<List<Integer>> result = new Solution().fourSum(nums, 0);
        int[][] resultArray = new int[result.size()][result.get(0).size()];
        int i = 0;
        for (List<Integer> ele : result) {
            int j = 0;
            for (Integer n : ele) {
                resultArray[i][j++] = n;
            }
            i++;
        }
        int[][] expect = new int[][]{{-2,-1,1,2},{-2,0,0,2}, {-1,0,0,1}};
        Arrays.stream(resultArray).forEach(array->{
            Arrays.sort(array);
        });

        Assertions.assertArrayEquals(expect, resultArray);
    }
}