package org.leetcode.problems.p383;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void canConstruct() {
    String ransomNote = "aa", magazine = "aab";
    boolean result = new Solution().canConstruct(ransomNote, magazine);
    Assertions.assertTrue(result);
    ransomNote = "a";
    magazine = "b";
    result = new Solution().canConstruct(ransomNote, magazine);
    Assertions.assertFalse(result);
  }
}