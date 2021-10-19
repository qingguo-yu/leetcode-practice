package org.leetcode.problems.dp.p322;

//https://leetcode.com/problems/coin-change/discuss/77368/*Java*-Both-iterative-and-recursive-solutions-with-explanations
//dp
public class Solution {
  public int coinChange(int[] coins, int amount) {
    if(coins == null || coins.length == 0) return -1;
    if(amount == 0) return 0;
    int[] dp = new int[amount + 1]; //dp[0] stands for 0 number of coins for 0 money
    int sum = 0;
    while (++sum <= amount) {
      int min = -1;
      for (int coin : coins) {
        if (sum >= coin && dp[sum - coin] != -1) {
          int tmp = dp[sum - coin] + 1;
          min = min == -1 ? tmp : (min < tmp ? min : tmp);
        }
      }
      dp[sum] = min;
    }
    return dp[amount];
  }
}
