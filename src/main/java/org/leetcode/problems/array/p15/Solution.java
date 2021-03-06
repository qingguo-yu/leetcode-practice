package org.leetcode.problems.array.p15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> tuples = twoSumTarget(nums, i + 1, -nums[i]);
            for (List<Integer> tuple : tuples) {
                tuple.add(nums[i]);
                result.add(tuple);
            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i ++;
            }

        }
        return result;
    }

    private List<List<Integer>> twoSumTarget(int[] nums, int start, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int end = nums.length - 1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            int left = nums[start], right = nums[end];
            if (sum > target) {
                while(start < end && right == nums[end]) end --;
            } else if (sum < target) {
                while(start < end && left == nums[start]) start ++;
            }
            else {
                result.add(new ArrayList<Integer>(Arrays.asList(left, right)));
                while(start < end && right == nums[end]) end --;
                while(start < end && left == nums[start]) start ++;
            }
        }
        return result;
    }
}
