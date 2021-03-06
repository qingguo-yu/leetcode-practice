package org.leetcode.problems.slidingwindow.p76;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        String result = new Solution().minWindow("abcd", "abc");
        Assertions.assertEquals("abc", result);
    }
}
