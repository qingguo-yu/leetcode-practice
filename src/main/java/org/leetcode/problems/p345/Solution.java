package org.leetcode.problems.p345;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
  private Set<Character> set = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
  public String reverseVowels(String s) {
    char[] charArray = s.toCharArray();
    int left = 0, right = s.length() - 1;
    while(left < right){
      while(left < s.length() && !set.contains(s.charAt(left))) left ++;
      while(right >= 0 && !set.contains(s.charAt(right)))right --;
      if(left != right){
        char tmp = s.charAt(left);
        charArray[left] = s.charAt(right);
        charArray[right] = tmp;
      }
      left ++;
      right --;
    }
    return new String(charArray);
  }
}
