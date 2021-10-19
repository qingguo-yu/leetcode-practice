package org.leetcode.problems.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutonTest {

  @Test
  void searchInsert() {
    int[] nums = new int[]{1,3,5,6};
    int target = 5;
    int result = new Soluton().searchInsert(nums, target);
    Assertions.assertEquals(2, result);
  }

  @Test
  void searchInsert_1() {
    int[] nums = new int[]{1,3,5,6};
    int target = 2;
    int result = new Soluton().searchInsert(nums, target);
    Assertions.assertEquals(1, result);
  }

  @Test
  void searchInsert_7() {
    int[] nums = new int[]{1,3,5,6};
    int target = 7;
    int result = new Soluton().searchInsert(nums, target);
    Assertions.assertEquals(4, result);
  }

  @Test
  void searchInsert_0() {
    int[] nums = new int[]{1,3,5,6};
    int target = 0;
    int result = new Soluton().searchInsert(nums, target);
    Assertions.assertEquals(0, result);
  }
  @Test
  void searchInsert_4() {
    int[] nums = new int[]{1,3,5,6};
    int target = 4;
    int result = new Soluton().searchInsert(nums, target);
    Assertions.assertEquals(2, result);
  }

  @Test
  void searchInsert_0_0() {
    int[] nums = new int[]{1};
    int target = 0;
    int result = new Soluton().searchInsert(nums, target);
    Assertions.assertEquals(0, result);
  }
}