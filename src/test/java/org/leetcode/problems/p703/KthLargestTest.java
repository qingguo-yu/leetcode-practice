package org.leetcode.problems.p703;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthLargestTest {

  @Test
  void add() {
    int[] nums = new int[]{ 8, 5, 4, 2};
    KthLargest solution = new KthLargest(3, nums);
    Assertions.assertEquals(4, solution.add(3));
    Assertions.assertEquals(5, solution.add(5));
    Assertions.assertEquals(5, solution.add(10));
    Assertions.assertEquals(8, solution.add(9));
    Assertions.assertEquals(8, solution.add(4));
  }
  @Test
  void addWithSize1(){
    KthLargest solution = new KthLargest(1, new int[]{});
    Assertions.assertEquals(-3, solution.add(-3));
  }
  @Test
  void priorityQueueComparator(){
    PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    Assertions.assertEquals(3, queue.peek());
  }
}