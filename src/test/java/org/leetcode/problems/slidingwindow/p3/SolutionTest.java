package org.leetcode.problems.slidingwindow.p3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        int result = new Solution().lengthOfLongestSubstring("abcabcbb");
        Assertions.assertEquals(3, result);
    }
    @Test
    public void SolutionTest1(){
        int result = new Solution().lengthOfLongestSubstring("bbbbb");
        Assertions.assertEquals(1, result);
    }
    @Test
    public void SolutionTest2(){
        int result = new Solution().lengthOfLongestSubstring("pwwkew");
        Assertions.assertEquals(3, result);
    }
    @Test
    public void SolutionTest3(){
        int result = new Solution().lengthOfLongestSubstring("");
        Assertions.assertEquals(0, result);
    }
}
