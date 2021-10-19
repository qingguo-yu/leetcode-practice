package org.leetcode.problems.p171;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void titleToNumber() {
    String s = "A";
    int result = new Solution().titleToNumber(s);
    Assertions.assertEquals(1, result);
    result = new Solution().titleToNumber("AA");
    Assertions.assertEquals(27, result);
    result = new Solution().titleToNumber("AB");
    Assertions.assertEquals(28, result);
    result = new Solution().titleToNumber("ZY");
    Assertions.assertEquals(701, result);
  }

  @Test
  void titleToNumber_solution1() {
    String s = "A";
    int result = new Solution1().titleToNumber(s);
    Assertions.assertEquals(1, result);
    result = new Solution1().titleToNumber("AA");
    Assertions.assertEquals(27, result);
    result = new Solution1().titleToNumber("AB");
    Assertions.assertEquals(28, result);
    result = new Solution1().titleToNumber("ZY");
    Assertions.assertEquals(701, result);
  }
}