package org.leetcode.problems.array.p710;

import java.util.*;

public class Solution {
    HashMap<Integer, Integer> indexMap = new HashMap<>();
    Random random = new Random();
    private int sz = 0;
    public Solution(int N, int[] blacklist) {
        Set<Integer> bSet = new HashSet<>();
        int bcount = blacklist.length;
        sz = N - bcount;
        for (int val : blacklist) {
            bSet.add(val);
        }
        int last = N -1;
        for (int val : blacklist) {
            if (val >= sz) {
                continue;
            }
            while (bSet.contains(last)) {
                last --;
            }
            indexMap.put(val, last--);
        }
    }

    public int pick() {
        int rndIndex = random.nextInt(sz);
        int val = indexMap.getOrDefault(rndIndex, -1);
        if ( val >= 0) {
            return val;
        }
        return rndIndex;
    }

}
