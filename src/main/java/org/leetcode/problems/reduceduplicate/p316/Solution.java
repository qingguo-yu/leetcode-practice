package org.leetcode.problems.reduceduplicate.p316;

import java.util.Stack;

public class Solution {
    public String removeDuplicateLetters(String s) {
        if(s == null || s.isEmpty()){
            return null;
        }
        int[] count = new int[256];
        Stack<Character> stack = new  Stack<>();
        boolean[] inStack = new boolean[256];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        for (char c : s.toCharArray()) {
            count[c]--;
            if (inStack[c]) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c) {
                if (count[stack.peek()] == 0) {
                    break;
                }
                inStack[stack.pop()] = false;
            }
            stack.push(c);
            inStack[c] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
