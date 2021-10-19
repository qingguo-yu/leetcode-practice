package org.leetcode.problems.p215;

public class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0 )
            throw new IllegalArgumentException("nums should not be empty");
        int lo = 0, hi = nums.length - 1;
        k = nums.length -k;
        while (lo <= hi) {
            int p = partition(nums, lo, hi);
            if (p < k) {
                lo = p + 1;
            } else if (p > k) {
                hi = p - 1;
            }
            else {
                return nums[p];
            }
        }
        return -1;
    }

    private int partition(int[] nums, int lo, int hi) {
        if (lo == hi) return lo;
        int pivot = nums[hi];
        int i = lo;
        for (int j = lo + 1; j < hi; j++) {
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i ++;
            }
        }
        swap(nums, i, hi);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        if(i == j) return;
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
