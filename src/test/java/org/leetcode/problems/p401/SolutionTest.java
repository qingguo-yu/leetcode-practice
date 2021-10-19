package org.leetcode.problems.p401;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void readBinaryWatch() {
    int turnedOn = 1;
    List<String> result = new Solution().readBinaryWatch(turnedOn);
    List<String> expect = Arrays
        .asList("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00");
    Assertions.assertEquals(expect, result);
  }
}