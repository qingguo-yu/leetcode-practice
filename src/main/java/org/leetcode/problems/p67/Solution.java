package org.leetcode.problems.p67;

public class Solution {
  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int tailA = a.length() - 1, tailB = b.length() - 1, carry = 0;
    while(tailA >= 0 || tailB >= 0){
      int sum = carry;
      if (tailA >= 0) {
        sum += a.charAt(tailA--) - '0';
      }
      if (tailB >= 0) {
        sum += a.charAt(tailB--) - '0';
      }
      sb.append(sum % 2);
      carry = sum / 2;

    }
    if (carry != 0) {
      sb.append(carry);
    }
    return sb.reverse().toString();
  }
}
