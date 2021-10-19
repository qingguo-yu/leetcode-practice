package org.leetcode.problems.p215;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0 )
            throw new IllegalArgumentException("nums should not be empty");
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int val : nums) {
            heap.offer(val);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.peek();

    }
}
