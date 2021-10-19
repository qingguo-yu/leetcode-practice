package org.leetcode.problems.p171;

public class Solution {
  public int titleToNumber(String columnTitle) {
    int result = 0;
    int j = 0;
    for(int i = columnTitle.length() - 1; i >=0; i--){
      result += (columnTitle.charAt(i) - 'A' + 1) * (int)Math.pow(26, j);
      j++;
    }
    return result;
  }
}
