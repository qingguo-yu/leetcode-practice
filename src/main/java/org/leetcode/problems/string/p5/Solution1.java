package org.leetcode.problems.string.p5;

public class Solution1 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String res = "";
        for(int i = 0; i < s.length(); i ++){
            String s1 = getPalindrome(s, i, i);
            String s2 = getPalindrome(s, i, i + 1);
            res = res.length() > s1.length()? res : s1;
            res = res.length() > s2.length()? res : s2;
        }
        return res;
    }

    private String getPalindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l --;
            r ++;
        }
        return s.substring(l + 1, r );
    }

}
