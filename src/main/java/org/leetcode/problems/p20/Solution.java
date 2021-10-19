package org.leetcode.problems.p20;

import java.util.Map;
import java.util.Stack;

public class Solution {
    private static Map<Character, Character> MAP = Map.of(')', '(', ']', '[', '}', '{');
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if (MAP.containsKey(c)) {
                char match = stack.pop();
                if (match != MAP.get(c)) {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
