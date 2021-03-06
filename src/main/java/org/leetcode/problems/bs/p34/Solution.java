package org.leetcode.problems.bs.p34;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        result[0] = leftBound(nums, target);
        result[1] = rightBound(nums, target);

        return result;
    }

    private int leftBound(int[] nums, int target) {
        int left = 0, right = nums.length -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }
            else if (nums[mid] >= target) {
                right = mid - 1;
            }
        }
        if (left > nums.length - 1 || nums[left] != target) {
            return -1;
        }
        return left;
    }
    private int rightBound(int[] nums, int target) {
        int left = 0, right = nums.length -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (right < 0  || nums[right] != target) {
            return -1;
        }
        return right;
    }
}
