package com.leetcode.array.easy;

public class LeftAndRightSumDifferences {

    /**
     * 2574. Left and Right Sum Differences
     * Solved
     * Easy
     * Topics
     * Companies
     * Hint
     * Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
     * <p>
     * answer.length == nums.length.
     * answer[i] = |leftSum[i] - rightSum[i]|.
     * Where:
     * <p>
     * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
     * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
     * Return the array answer.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [10,4,8,3]
     * Output: [15,1,11,22]
     * Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
     * The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
     * Example 2:
     * <p>
     * Input: nums = [1]
     * Output: [0]
     * Explanation: The array leftSum is [0] and the array rightSum is [0].
     * The array answer is [|0 - 0|] = [0].
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 1000
     * 1 <= nums[i] <= 105
     */
    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                int num = 0;
                for (int j = 0; j < i; j++) {
                    num += nums[j];
                }
                leftSum[i] = num;
            }
            if (i != nums.length - 1) {
                int num = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    num += nums[j];
                }
                rightSum[i] = num;
                System.out.println(num);
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }
}
