package org.leetcode.problems.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void lengthOfLastWord() {
    String s =  "Hello World";
    int result = new Solution().lengthOfLastWord(s);
    Assertions.assertEquals(5, result);

    s =  "World";
    result = new Solution().lengthOfLastWord(s);
    Assertions.assertEquals(5, result);

    s =  "   fly me   to   the moon  ";
    result = new Solution().lengthOfLastWord(s);
    Assertions.assertEquals(4, result);

    s =  "luffy is still joyboy";
    result = new Solution().lengthOfLastWord(s);
    Assertions.assertEquals(6, result);

  }
}