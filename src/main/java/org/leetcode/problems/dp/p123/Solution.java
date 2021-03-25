package org.leetcode.problems.dp.p123;

public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp_i10 = 0, dp_i11 = Integer.MIN_VALUE;
        int dp_i20 = 0, dp_i21 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            dp_i20 = Math.max(dp_i20, dp_i21 + prices[i]);
            dp_i21 = Math.max(dp_i21, dp_i10 - prices[i]);
            dp_i10 = Math.max(dp_i10, dp_i11 + prices[i]);
            dp_i11 = Math.max(dp_i11,  - prices[i]);
        }
        return dp_i20;
    }
}
