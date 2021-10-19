package org.leetcode.problems.p119;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void getRow() {
    List<Integer> result = new Solution().getRow(0);
    Integer[] expect = new Integer[]{1};
    Assertions.assertArrayEquals(expect, result.toArray());

    result = new Solution().getRow(1);
    expect = new Integer[]{1,1};
    Assertions.assertArrayEquals(expect, result.toArray());

    result = new Solution().getRow(2);
    expect = new Integer[]{1, 2, 1};
    Assertions.assertArrayEquals(expect, result.toArray());
  }
}