package com.leetcode.array;

import java.util.HashMap;

public class TwoSum {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     *
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     *
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     *
     *
     * Constraints:
     *
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * Only one valid answer exists.
     *
     *
     * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     */

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum2(nums, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int numA = 0;
        int numb = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i]; j++) {
                numA = nums[i];
                numb = nums[j];
                if(target == (numA + numb) && i != j){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])
            && i != map.get(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
