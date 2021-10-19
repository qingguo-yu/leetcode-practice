package org.leetcode.problems.dfs.p46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    private List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return result;
        }
        LinkedList<Integer> track = new LinkedList<>();
        backtrace(nums, track);
        return result;

    }

    private void backtrace(int[] nums, LinkedList<Integer> track) {
        if (track.size() == nums.length) {
            result.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            track.add(nums[i]);
            backtrace(nums, track);
            track.removeLast();
        }
    }
}
