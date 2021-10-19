package org.leetcode.problems.s459;

public class Solution {
  public boolean repeatedSubstringPattern(String s) {
    if(s == null || s.length() == 0) return false;
    String ss = s + s;
//    if(ss.length() -2 == 0) return true;
    ss = ss.substring(1, ss.length() -1);
    return ss.contains(s);
  }
}
