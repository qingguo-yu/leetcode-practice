package org.leetcode.problems.p119;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new ArrayList<>(Collections.nCopies(rowIndex + 1, 0));
    result.set(0, 1);
    if(rowIndex == 0) return result;
    for(int i = 1 ; i <= rowIndex; i ++){
      for(int j = i; j >= 1; j --){
        result.set(j, result.get(j - 1) + result.get(j));
      }
    }
    return result;
  }
}
