package org.leetcode.problems.p215;

import java.util.Random;

public class QuickSort {
    public void sort(int[] nums) {
        // shuffle nums
        shuffle(nums);
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] nums, int lo, int hi) {
        if(lo >= hi) return;
        int p = partition(nums, lo, hi);
        sort(nums, lo, p - 1);
        sort(nums, p + 1, hi);
    }

    private int partition(int[] nums, int lo, int high) {
        return -1;
    }

    private void shuffle(int[] nums) {
        int n = nums.length;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int j = i + rand.nextInt(n - i);
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[i] = tmp;
    }

}
