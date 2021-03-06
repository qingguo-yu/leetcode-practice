package org.leetcode.problems.array.p15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void threeSum() {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = new Solution().threeSum(nums);
        if(result.size() == 0){
            Assertions.assertEquals(0, result.size());
        }
        int[][] resultArray = new int[result.size()][result.get(0).size()];
        int i = 0;
        for (List<Integer> ele : result) {
            int j = 0;
            for (Integer n : ele) {
                resultArray[i][j++] = n;
            }
            i++;
        }
        int[][] expect = new int[][]{{-1,2, -1},{0,1,-1}};

        Assertions.assertArrayEquals(expect, resultArray);
    }
}