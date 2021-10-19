package org.leetcode.problems.p746;

public class Solution {
  public int findComplement(int num) {

    int originalNum = num;
    int mask = ~0;
    while ((mask & originalNum) != 0){
      mask <<=1;
    }
    return ~mask ^ num;
  }
}
