package org.leetcode.problems.slidingwindow.p3;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        if(s == null || s.length() == 0) return result;
        int left = 0, right = 0;
        HashMap<Character, Integer> actual = new HashMap<>();
        while(right < s.length()){
            char c = s.charAt(right ++);
            actual.put(c, actual.getOrDefault(c, 0) + 1);
            while(actual.get(c) > 1){
                char d = s.charAt(left++);
                actual.put(d, actual.get(d) - 1);
            }
            result = Integer.max(result, right - left);
        }
        return  result;
    }
}
