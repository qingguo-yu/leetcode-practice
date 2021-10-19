package org.leetcode.problems.backtracking.p793;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if(digits == null || digits.length() == 0) return result;
        result.add("");
        for(int i = 0; i < digits.length(); i ++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i){
                String t = result.remove();
                for(char s: mapping[x].toCharArray()){
                    result.add(t + s);
                }
            }
        }
        return result;
    }
}
