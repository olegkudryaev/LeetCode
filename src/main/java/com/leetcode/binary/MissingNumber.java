package com.leetcode.binary;

import java.util.Arrays;

public class MissingNumber {

    /**
     * 268. Missing Number
     * Easy
     * Topics
     * Companies
     * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [3,0,1]
     * Output: 2
     * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
     * Example 2:
     * <p>
     * Input: nums = [0,1]
     * Output: 2
     * Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
     * Example 3:
     * <p>
     * Input: nums = [9,6,4,2,3,5,7,0,1]
     * Output: 8
     * Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == nums.length
     * 1 <= n <= 104
     * 0 <= nums[i] <= n
     * All the numbers of nums are unique.
     * <p>
     * <p>
     * Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
     */
    public static int missingNumber(int[] nums) {
//        int[] array = Arrays.stream(nums).sorted().toArray();
//        int result = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i != array[i]) {
//                result = i;
//                return result;
//            }
//        }
//        result = array.length;
//        return result;

//        int sum = Arrays.stream(nums).sum();
//        int sum2 = 0;
//        for (int i = 0; i < nums.length + 1; i++) {
//            sum2 += i;
//        }
//        return sum2 - sum;

        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
