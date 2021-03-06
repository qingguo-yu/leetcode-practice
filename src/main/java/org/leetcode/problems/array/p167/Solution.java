package org.leetcode.problems.array.p167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[]{-1, -1};
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if( sum == target){
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
            else if(sum > target){
                right --;
            } else if (sum < target) {
                left ++;
            }
        }
        return result;
    }
}
