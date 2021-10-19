package org.leetcode.problems.p383;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> map = new HashMap<>();
    char[] chars = magazine.toCharArray();
    for(char c: chars){
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    char[] chars1 = ransomNote.toCharArray();
    for (char c : chars1) {
      Integer n = map.get(c);
      if (n == null || n <= 0L) {
        return  false;
      }
      else {
        map.put(c, n - 1);
      }
    }
    return true;
  }
}
