package org.leetcode.problems.utils;

public class UnionFind {
    private int count;
    private int[] parent;
    private int[] size;

    public UnionFind(int n){
        this.count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }
    public UnionFind(char[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        parent = new int[m * n];
        size = new int[m * n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    int id = i * n + j;
                    parent[id] = id;
                    size[id] = 1;
                    count ++;
                }
            }
        }
    }
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ) return;
        if (size[rootP] > size[rootQ]) {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        else {
            parent[rootP] =  rootQ;
            size[rootQ] += size[rootP];
        }
        count --;
    }

    public boolean connected(int p, int q) {
        int rootP = parent[p];
        int rootQ = parent[q];
        return rootP == rootQ;
    }
    public int count() {
        return count;
    }

    private int find(int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
}
