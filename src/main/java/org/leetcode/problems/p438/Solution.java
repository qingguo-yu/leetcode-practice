package org.leetcode.problems.p438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s == null || s.length() == 0) return result;
        if(p == null || p.length() == 0) return result;
        if(p.length() > s.length()) return result;
        int left = 0, right = 0, valid = 0;
        HashMap<Character, Integer> expect = new HashMap<>(p.length());
        HashMap<Character, Integer> actual = new HashMap<>(p.length());
        for(char c : p.toCharArray()){
            expect.put(c, expect.getOrDefault(c, 0) + 1);
        }
        while(right < s.length()){
            char c = s.charAt(right ++);
            if(expect.getOrDefault(c, 0) != 0){
                actual.put(c, actual.getOrDefault(c, 0) + 1);
                if(actual.get(c).equals(expect.get(c))){
                    valid ++;
                }
            }
            while(valid == expect.size()){
                if(right - left == p.length()){
                    result.add(left);
                }
                char d = s.charAt(left ++);
                if(expect.getOrDefault(d, 0) != 0){
                    if(actual.get(d).equals(expect.get(d))){
                        valid -- ;
                    }
                    actual.put(d, actual.get(d) - 1);
                }
            }
        }
        return result;
    }
}
