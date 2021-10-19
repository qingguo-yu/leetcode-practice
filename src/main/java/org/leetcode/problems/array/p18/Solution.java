package org.leetcode.problems.array.p18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        result = nSumTarget(nums, 4, 0, target);
        return result;
    }
    private List<List<Integer>> nSumTarget(int[] nums, int n, int start, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (n < 2 || nums == null || nums.length < n) {
            return result;
        }
        int sz = nums.length;
        if (n == 2) {
            int lo = start, hi = sz -1;
            while (lo < hi) {
                int sum = nums[lo] + nums[hi];
                int left = nums[lo], right = nums[hi];
                if (sum < target) {
                    while(lo < hi && nums[lo] == left) lo ++;
                } else if (sum > target) {
                    while(lo < hi && nums[hi] == right) hi --;
                }
                else {
                    result.add(new ArrayList<>(Arrays.asList(left, right)));
                    while(lo < hi && nums[lo] == left) lo ++;
                    while(lo < hi && nums[hi] == right) hi --;
                }
            }
        }
        else {
            for (int i = start; i < sz; i++) {
                List<List<Integer>> sub = nSumTarget(nums, n - 1, i + 1, target - nums[i]);
                for (List<Integer> ele : sub) {
                    ele.add(nums[i]);
                    result.add(ele);
                }
                while(i < sz - 1 && nums[i] == nums[i+1]) i ++;
            }
        }
        return result;
    }

}
