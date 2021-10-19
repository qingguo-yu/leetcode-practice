package org.leetcode.problems.dp.p322;

//Solution from: https://leetcode.com/problems/coin-change/discuss/77368/*Java*-Both-iterative-and-recursive-solutions-with-explanations
public class Solution1 {
  public int coinChange(int[] coins, int amount) {
    if(coins == null || coins.length == 0) return -1;
    if(amount == 0) return 0;
    return helper(coins, amount, new int[amount + 1]);
  }

  private int helper(int[] coins, int remainder, int[] count) { // reaminder: remaining coins after the last step; count[rem]: minimum number of coins to sum up to rem
    if(remainder < 0) return -1; //not valid
    if(remainder == 0) return 0; //complete
    if(count[remainder] != 0) return count[remainder];
    int min = Integer.MAX_VALUE;
    for (int coin : coins) {
      int res = helper(coins, remainder - coin, count);
      if (res >= 0 && res < min) {
        min = 1 + res;
      }
    }
    count[remainder] = (min == Integer.MAX_VALUE)? -1: min;
    return count[remainder];
  }
}
