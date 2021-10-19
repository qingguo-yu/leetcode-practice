package org.leetcode.problems.p169;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }
    int result = map.entrySet().stream().max((p1, p2)->{return p1.getValue() - p2.getValue();}).get().getKey();
    return result;
  }
}
