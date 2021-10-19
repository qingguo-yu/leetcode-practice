package org.leetcode.problems.p290;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    int n = words.length;
    if( n != pattern.length()) return false;
    Map<String, Character> map1 = new HashMap<>();
    Map< Character, String> map2 = new HashMap<>();
    for(int i = 0; i < n; i ++){
      char c1 = pattern.charAt(i);
      String word1 = words[i];
      Character c = map1.get(word1);
      String word = map2.get(c1);
      if( c == null && word == null){
        map1.put(word1, c1);
        map2.put(c1, word1);
        continue;
      }
      if(c == null || word == null){
        return false;
      }
      if (c != null && word != null && (c != c1 || !word.equals(word1))){
        return false;
      }
    }
    return true;
  }
}
