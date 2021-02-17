package org.leetcode.problems.p752;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.problems.p752.Solution;

public class SolutionTest {
    @Test
    public void SolutionTest(){
        String[] deadends = new String[] {"0201","0101","0102","1212","2002"};
        String target = "0202";
        int steps = new Solution().openLock(deadends, target);
        Assertions.assertEquals(6,  steps);
    }
    @Test
    public void SolutionTest1(){
        String[] deadends = new String[] {"8888"};
        String target = "0009";
        int steps = new Solution().openLock(deadends, target);
        Assertions.assertEquals(1,  steps);
    }
    @Test
    public void SolutionTest2(){
        String[] deadends = new String[] {"8887","8889","8878","8898","8788","8988","7888","9888"};
        String target = "8888";
        int steps = new Solution().openLock(deadends, target);
        Assertions.assertEquals(-1,  steps);
    }
    @Test
    public void SolutionTest3(){
        String[] deadends = new String[] {"0000"};
        String target = "8888";
        int steps = new Solution().openLock(deadends, target);
        Assertions.assertEquals(-1,  steps);
    }
}
