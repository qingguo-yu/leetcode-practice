package org.leetcode.problems.p186;

public class Solution {
  public String convertToTitle(int columnNumber) {
    StringBuilder sb = new StringBuilder();
    while(columnNumber > 26){
      int tmp1 = (columnNumber - 1) % 26;
      char ch = (char)('A' + tmp1);
      sb.append(ch);
      columnNumber = columnNumber / 26;
    }
    char ch = (char)('A' + columnNumber - 1);
    sb.append(ch);
    return sb.reverse().toString();
  }
}
