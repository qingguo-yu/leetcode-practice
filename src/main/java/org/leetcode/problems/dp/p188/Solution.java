package org.leetcode.problems.dp.p188;

import java.util.Arrays;

public class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (k >= n >>> 1) {
            int T_ik0 = 0, T_ik1 = Integer.MIN_VALUE;
            for (int price : prices) {
                int tmp = T_ik0;
                T_ik0 = Math.max(T_ik0, T_ik1 + price);
                T_ik1 = Math.max(T_ik1, tmp - price);
            }
            return T_ik0;
        }

        int[] T_ik0 = new int[k + 1];
        int[] T_ik1 = new int[k + 1];
        Arrays.fill(T_ik1, Integer.MIN_VALUE);
        int i = 0;
        for (int price : prices) {
            for (int j = k; j > 0; j--) {
                T_ik0[j] = Math.max(T_ik0[j], T_ik1[j] + price);
                T_ik1[j] = Math.max(T_ik1[j], T_ik0[j - 1] - price);

            }

        }

        return T_ik0[k];

    }
}
