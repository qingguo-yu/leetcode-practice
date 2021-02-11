package org.leetcode.problems.p438;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p438.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        List<Integer> result = new Solution().findAnagrams("cbaebabacd", "abc");
        List<Integer> expect = Arrays.asList(0, 6);
        Assertions.assertEquals(expect, result);
    }

    @Test
    public void SolutionTest_1(){
        List<Integer> result = new Solution().findAnagrams("abab", "ab");
        List<Integer> expect = Arrays.asList(0, 1, 2);
        Assertions.assertEquals(expect, result);
    }

}
