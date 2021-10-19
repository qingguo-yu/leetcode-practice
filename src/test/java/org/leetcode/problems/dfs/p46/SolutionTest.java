package org.leetcode.problems.dfs.p46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    void permute() {
        int[] nums = new int[]{1, 2};
        int[][] expect = new int[][]{{1, 2}, {2, 1}};
        List<List<Integer>> result = new Solution().permute(nums);
        int[][] resultArray = new int[result.size()][result.get(0).size()];
        int index = 0;
        for(List<Integer> list: result){
            int j = 0;
            for (Integer n : list) {
                resultArray [index] [j++] = n;
            }
            index ++;
        }
        Assertions.assertArrayEquals(expect, resultArray);
    }
}