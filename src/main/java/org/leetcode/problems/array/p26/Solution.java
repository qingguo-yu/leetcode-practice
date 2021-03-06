package org.leetcode.problems.array.p26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if(nums[fast] != nums[slow]){
                slow ++;
                nums[slow] = nums[fast];
            }
            fast ++;
        }
        return slow + 1;
    }
}
