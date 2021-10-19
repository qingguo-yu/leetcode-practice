package org.leetcode.problems.p349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    if(nums1 == null || nums2 == null) throw new IllegalArgumentException("nums1 or nums2 should not be empty.");
    Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
    Set<Integer> set1 = new HashSet<>();
    for(int n : nums2){
      if(set.contains(Integer.valueOf(n))){
        set1.add(n);
      }
    }
    return set1.stream().mapToInt(i -> i).toArray();

  }
}
