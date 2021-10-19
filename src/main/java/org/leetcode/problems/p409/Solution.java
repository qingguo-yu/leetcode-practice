package org.leetcode.problems.p409;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

  public int longestPalindrome(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for(char c: s.toCharArray()){
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    if(map.size() == 1) return map.entrySet().iterator().next().getValue();
    int length = 0;
    boolean addOne = false;
    for(Map.Entry<Character, Integer> entry: map.entrySet()){
      if(entry.getValue() == 1 && !addOne ){
        length ++;
        addOne = true;
      }
      else if(entry.getValue() % 2 == 0){
        length += entry.getValue();
      }
    }
    return length;
  }

}
