package org.leetcode.problems.backtracking.p793;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if(digits == null || digits.length() == 0) return result;
        result.add("");
        while (result.peek().length() != digits.length()) {
            String t = result.remove();
            int index = digits.charAt(t.length()) - '0';
            for (char c : mapping[index].toCharArray()) {
                result.add(t + c);
            }
        }
        return result;
    }
}
