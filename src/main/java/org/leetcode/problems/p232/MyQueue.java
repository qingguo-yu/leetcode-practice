package org.leetcode.problems.p232;

import java.util.Stack;

class MyQueue {
  Stack<Integer> stack1 = new Stack<>();
  Stack<Integer> stack2 = new Stack<>();
  /** Initialize your data structure here. */
  public MyQueue() {

  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    stack1.push(x);
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    peek();
    return stack2.pop();
  }

  /** Get the front element. */
  public int peek() {
    if (!stack2.isEmpty()) {
      return stack2.peek();
    }
    while (stack1.size() > 0) {
      stack2.push(stack1.pop());
    }
    return stack2.peek();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return stack1.isEmpty() && stack2.isEmpty();
  }
}
