package org.leetcode.problems.p752;

import java.util.*;

public class Solution {
    private String plusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '9') {
            ch[j] = '0';
        }
        else {
            ch[j] += 1;
        }
        return new String(ch);
    }
    private String minusOne(String s, int j) {
        char[] ch = s.toCharArray();
        if (ch[j] == '0') {
            ch[j] = '9';
        }
        else {
            ch[j] -= 1;
        }
        return new String(ch);
    }
    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet<>(deadends.length);
        for(String s : deadends) deads.add(s);
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        int steps = 0;
        q.offer("0000");
        visited.add("0000");

        while(!q.isEmpty()){
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                String cur = q.poll();

                if (deads.contains(cur)) {
                    continue;
                }
                if (cur.equals(target)) {
                    return steps;
                }

                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up)) {
                        q.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur, j);
                    if (!visited.contains(down)) {
                        q.offer(down);
                        visited.add(down);
                    }
                }
            }
            steps ++;
        }
        return -1;
    }
}
