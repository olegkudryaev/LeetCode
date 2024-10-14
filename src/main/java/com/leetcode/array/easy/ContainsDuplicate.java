package com.leetcode.array.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,1]
     * Output: true
     * Example 2:
     * <p>
     * Input: nums = [1,2,3,4]
     * Output: false
     * Example 3:
     * <p>
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     */

    public static void main(String[] args) {
        int [] nums1 = new int[]{1,2,3,1};
        int [] nums2 = new int[]{1,2,3,4};
        int [] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }

    /*public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }*/

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(setNums.contains(nums[i])){
                return true;
            };
            setNums.add(nums[i]);
        }
        return false;
    }
}
