package org.leetcode.problems.p401;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> readBinaryWatch(int turnedOn) {
    List<String> result = new ArrayList<>();
    for (int h = 0; h < 12; h++) {
      for (int m = 0; m < 60; m++) {
        if (Integer.bitCount(h * 64 + m) == turnedOn) {
          result.add(String.format("%d:%02d", h, m));
        }
      }
    }
    return  result;
  }
}
