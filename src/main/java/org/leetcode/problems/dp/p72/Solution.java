package org.leetcode.problems.dp.p72;

public class Solution {
  public int minDistance(String word1, String word2) {
    if(word1 == null || word2 == null) return -1;
    int m = word1.length();
    int n = word2.length();
    //row stands for characters of word1, columns stands for characters of word2. Row 0 stands for empty string of word1, Column o stands for empty string of word2
    int[][] distance = new int[m + 1][ n + 1];
    for (int i = 0; i <= m; i++) {
      distance[i][0] = i;//distance of word1 -> empty string
    }
    for (int j = 0; j <= n; j++) {
      distance[0][j] = j; //distance of empty string -> words
    }
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (word1.charAt(i) == word2.charAt(j)) {
          distance[i + 1][j + 1] = distance[i][j];
        }
        else {
          int a = distance[i][j];
          int b = distance[i][j + 1];
          int c = distance[i + 1][j];
          int min = a < b ? (a < c ? a : c) : (b < c ? b : c);
          distance[ i + 1][j + 1] = min + 1;
        }
      }
    }
    return distance[m][n];
  }
}
