package org.leetcode.problems.p492;

public class Solution {
  public int[] constructRectangle(int area) {
    int L = area, prevL = area,  W = 1;
    while(L >= W && L * W == area){
      W ++;
      prevL = L;
      L = area / W;
    }
    return new int[]{prevL, --W };
  }
}
