package org.leetcode.problems.slidingwindow.p567;

import java.util.HashMap;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2 == null || s2.length() == 0) return false;
        if(s1 == null || s1.length() == 0) return false;
        if(s1.length() > s2.length()) return false;
        HashMap<Character, Integer> expect, actual;
        expect = new HashMap<>(s1.length());
        actual = new HashMap<>(s1.length());

        for(char c : s1.toCharArray()){
            expect.put(c, expect.getOrDefault(c,0) + 1 );
        }
        int left = 0, right = 0, match = 0;
        int count = 0;
        while(right < s2.length()){
            char c = s2.charAt(right ++);
            if(expect.getOrDefault(c, 0).intValue() > 0){
                actual.put(c, actual.getOrDefault(c, 0) + 1);
                if(actual.get(c).equals(expect.get(c))){
                    match ++;
                }
            }
//            System.out.println(String.format("%d-window: [%d, %d)",count++, left, right));
            while(right - left >= s1.length()){
                if(match == expect.size()){
                    return true;
                }
//                System.out.println(String.format("%d-window: [%d, %d)",count++, left, right));
                char d = s2.charAt(left ++);
                if(expect.getOrDefault(d, 0) > 0) {
                    if(actual.get(d).equals(expect.get(d))){
                        match --;
                    }
                    actual.put(d, actual.get(d) - 1);
                }
            }
        }

        return false;
    }
}
