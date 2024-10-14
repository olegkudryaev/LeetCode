package com.leetcode.array.medium;

public class SearchInRotatedSortedArray {
    /**
     * 33. Search in Rotated Sorted Array
     * Medium
     * Topics
     * Companies
     * There is an integer array nums sorted in ascending order (with distinct values).
     * <p>
     * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
     * <p>
     * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
     * <p>
     * You must write an algorithm with O(log n) runtime complexity.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [4,5,6,7,0,1,2], target = 0
     * Output: 4
     * Example 2:
     * <p>
     * Input: nums = [4,5,6,7,0,1,2], target = 3
     * Output: -1
     * Example 3:
     * <p>
     * Input: nums = [1], target = 0
     * Output: -1
     */

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            }


            //5671234
            if (nums[m] >= nums[l]) {
                if (target >= nums[l] && target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
            //1234567
            if (nums[m] <= nums[r]) {
                if (target > nums[m] && target <= nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
        //6, 7, 8, 9, 3, 4, 5
    }
}
