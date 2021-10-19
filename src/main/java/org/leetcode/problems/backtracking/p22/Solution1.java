package org.leetcode.problems.backtracking.p22;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    private String indent = "";
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        _gen(ans,  0, 0, n, "");
        return ans;
    }

    private void _gen(List<String> ans, int left, int right, int n, String result) {
        if (left == n && right == n) {
            ans.add(result);
            System.out.println(result);
            return;
        }
        if (left < n) {
            indent += " ";
            System.out.println(indent + "enter _gen with left (");
            _gen(ans, left + 1, right, n, result + "(");
            System.out.println(indent + "exit _gen with left (");
            indent = indent.substring(0, indent.lastIndexOf(' '));
        }
        if (left > right && right < n) {
            indent += " ";
            System.out.println(indent +  "enter _gen with right )");
            _gen(ans, left, right + 1, n, result + ")");
            System.out.println(indent + "exit _gen with right )");
            indent = indent.substring(0, indent.lastIndexOf(' '));
        }
    }

}
