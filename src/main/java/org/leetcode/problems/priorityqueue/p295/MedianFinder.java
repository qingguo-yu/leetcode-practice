package org.leetcode.problems.priorityqueue.p295;

import java.util.*;

public class MedianFinder {
    //maxHeap may have equal or one more element than minHeap
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a, b) ->{
            return b - a;
        });
    }

    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        return minHeap.size() < maxHeap.size()? maxHeap.peek(): (minHeap.peek() + maxHeap.peek()) / 2.0;
    }
}

