package com.leetcode.math.easy;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    /**
     * 3264. Final Array State After K Multiplication Operations I
     * Easy
     * Topics
     * Companies
     * Hint
     * You are given an integer array nums, an integer k, and an integer multiplier.
     * <p>
     * You need to perform k operations on nums. In each operation:
     * <p>
     * Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
     * Replace the selected minimum value x with x * multiplier.
     * Return an integer array denoting the final state of nums after performing all k operations.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
     * <p>
     * Output: [8,4,6,5,6]
     * <p>
     * Explanation:
     * <p>
     * Operation	Result
     * After operation 1	[2, 2, 3, 5, 6]
     * After operation 2	[4, 2, 3, 5, 6]
     * After operation 3	[4, 4, 3, 5, 6]
     * After operation 4	[4, 4, 6, 5, 6]
     * After operation 5	[8, 4, 6, 5, 6]
     * Example 2:
     * <p>
     * Input: nums = [1,2], k = 3, multiplier = 4
     * <p>
     * Output: [16,8]
     * <p>
     * Explanation:
     * <p>
     * Operation	Result
     * After operation 1	[4, 2]
     * After operation 2	[4, 8]
     * After operation 3	[16, 8]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 100
     * 1 <= nums[i] <= 100
     * 1 <= k <= 10
     * 1 <= multiplier <= 5
     */
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int min = nums[0];
        int minNum = 0;
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; 0 <= j; j--) {
                if (min >= nums[j]) {
                    min = nums[j];
                    minNum = j;
                }
            }
            nums[minNum] = min * multiplier;
            min = nums[0];
        }
        return nums;
    }
}
