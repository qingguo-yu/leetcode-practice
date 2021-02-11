package org.leetcode.problems.p76;

import java.util.HashMap;

public class Solution {
    public String minWindow(String s, String t) {
        if(s == null || s.length() == 0) return null;
        if(t == null || t.length() == 0) return null;
        if(t.length() >= s.length()) return null;
        HashMap<Character, Integer> need, window;
        need = new HashMap<>(t.length());
        window = new HashMap<>(t.length());
        for(char c : t.toCharArray()){
            need.put(c, need.getOrDefault(c,0).intValue() + 1);
        }
        int left = 0, right = 0, valid = 0;
        int start = 0, len = Integer.MAX_VALUE;
        while(right < s.length()){
            char c = s.charAt(right ++);
            //update data
            if(need.getOrDefault(c, 0) != 0){
                window.put(c, window.getOrDefault(c, 0 ) + 1);
                if(window.get(c).equals(need.get(c))){
                    valid ++;
                }
            }
            System.out.println(String.format("window: [%d, %d)", left, right));
            while(valid == need.size()){

                //update data
                if(right - left < len){
                    start = left;
                    len = right - left;
                }

                char d = s.charAt(left ++);

                //update data
                if(need.getOrDefault(d, 0) != 0){
                    if(window.get(d).equals(need.get(d))){
                        valid --;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE?"":s.substring(start, len + start);
    }
}
