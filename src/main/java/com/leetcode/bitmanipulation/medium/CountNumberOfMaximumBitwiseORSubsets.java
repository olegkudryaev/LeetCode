package com.leetcode.bitmanipulation.medium;

public class CountNumberOfMaximumBitwiseORSubsets {
    /**
     * 2044. Count Number of Maximum Bitwise-OR Subsets
     * Medium
     * Topics
     * Companies
     * Hint
     * Given an integer array nums, find the maximum possible bitwise OR of a subset of nums and return the number of different non-empty subsets with the maximum bitwise OR.
     * <p>
     * An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b. Two subsets are considered different if the indices of the elements chosen are different.
     * <p>
     * The bitwise OR of an array a is equal to a[0] OR a[1] OR ... OR a[a.length - 1] (0-indexed).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [3,1]
     * Output: 2
     * Explanation: The maximum possible bitwise OR of a subset is 3. There are 2 subsets with a bitwise OR of 3:
     * - [3]
     * - [3,1]
     * Example 2:
     * <p>
     * Input: nums = [2,2,2]
     * Output: 7
     * Explanation: All non-empty subsets of [2,2,2] have a bitwise OR of 2. There are 23 - 1 = 7 total subsets.
     * Example 3:
     * <p>
     * Input: nums = [3,2,1,5]
     * Output: 6
     * Explanation: The maximum possible bitwise OR of a subset is 7. There are 6 subsets with a bitwise OR of 7:
     * - [3,5]
     * - [3,1,5]
     * - [3,2,5]
     * - [3,2,1,5]
     * - [2,5]
     * - [2,1,5]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 16
     * 1 <= nums[i] <= 105
     */
    public static int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;
        // Step 1: Compute the maximum OR
        for (int num : nums) {
            maxOR |= num;
        }
        int[] count = new int[1];
        helpMethod(nums, 0, 0, maxOR, count);
        return count[0];
    }

    private static void helpMethod(int[] nums, int start, int currentOR, int maxOR, int[] count) {
        if (currentOR == maxOR) {
            count[0]++;
        }
        for (int i = start; i < nums.length; i++) {
            int newStart = i + 1;
            int newCurrentOR = currentOR | nums[i];

            helpMethod(nums, newStart, newCurrentOR, maxOR, count);
        }
    }
}
