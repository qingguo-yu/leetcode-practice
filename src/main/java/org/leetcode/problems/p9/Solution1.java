package org.leetcode.problems.p9;

public class Solution1 {
  public boolean isPalindrome(int x) {
    if (x<0 || (x!=0 && x%10==0)) return false;
    String s = String.valueOf(x);
    int l = 0, r = s.length() - 1;
    while (l < r) {
      if (s.charAt(l++) != s.charAt(r--)) {
        return false;
      }
    }
    return true;
  }
}
