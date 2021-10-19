package org.leetcode.problems.dp.p72;

import java.util.LinkedList;
import java.util.Queue;

//bfs
class DS {
  int index1;
  int index2;
  public DS(int index1, int index2) {
    this.index1 = index1;
    this.index2 = index2;
  }

  public String toString() {
    return this.index1 + "  " + this.index2 ;
  }
}
public class Solution1 {

  public int minDistance(String word1, String word2) {
    boolean[][] dp;
    dp = new boolean[word1.length()+1][word2.length()+1];
    Queue<DS> queue = new LinkedList<>();
    queue.add(new DS(0,0));
    int count = 0;
    while(!queue.isEmpty()) {
      int n = queue.size();
      while(n > 0) {
        boolean done = true;
        DS ds = queue.poll();
        int i = ds.index1;
        int j = ds.index2;
        if(dp[i][j]) {
          n--;
          continue;
        }
        dp[i][j] = true;
//        if(i >= word1.length() && j >= word2.length()) {
//          return count;
//        }
        while(i < word1.length() && j < word2.length()) {
          if(word1.charAt(i) == word2.charAt(j)) {
            i++;
            j++;
          } else {
            queue.offer(new DS(i+1,j+1));//update/replace
            queue.offer(new DS(i+1,j));//delete
            queue.offer(new DS(i,j+1));//insert
            done = false;
            break;
          }
        }
        if(done && i < word1.length()) {
          queue.offer(new DS(i+1,j));
        }
        else if(done && j < word2.length()) {
          queue.offer(new DS(i,j+1));
        }
        else if (done) {
          return count;
        }
        n--;
      }
      count++;
    }
    return -1;
  }
}
