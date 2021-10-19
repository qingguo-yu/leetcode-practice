package org.leetcode.problems.string.p392;

import java.util.ArrayList;

public class Solution1 {
    public boolean isSubsequence(String s, String t) {
        if(s == null || t == null) return false;
        //build index
        ArrayList<Integer>[] index = new ArrayList[256];
        for(int i = 0; i < t.length(); i ++){
            char c = t.charAt(i);
            if (index[c] == null){
                index[c] = new ArrayList<Integer>();
            }
            index[c].add(i);
        }
        int j = 0;
        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if(index[c] == null) return false;
            int p = left_bound(index[c], j);
            if(p == index[c].size()) return false;
            j = index[c].get(p) + 1;
        }
        return true;
    }
    private int left_bound(ArrayList<Integer> list, int target){
        int lo=0, hi = list.size();
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            if(target > list.get(mid)){
                lo = mid + 1;
            }
            else {
                hi = mid;
            }
        }
        return lo;
    }
}
