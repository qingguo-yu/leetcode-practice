package org.leetcode.problems.p567;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p567.Solution;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        boolean result = new Solution().checkInclusion("abc", "eidbaooo");
        Assertions.assertFalse(result);
    }
    @Test
    public void SolutionTest_false(){
        boolean result = new Solution().checkInclusion("da", "eidbaooo");
        Assertions.assertFalse(result);
    }
    @Test
    public void SolutionTest_True(){
        boolean result = new Solution().checkInclusion("ab", "eidbaooo");
        Assertions.assertTrue(result);
    }

    @Test
    public void SolutionTest_True1(){
        boolean result = new Solution().checkInclusion("abcdxabcde", "abcdeabcdx");
        Assertions.assertTrue(result);
    }
}
