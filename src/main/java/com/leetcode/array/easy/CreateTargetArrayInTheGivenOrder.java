package com.leetcode.array.easy;

import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {
    /**
     * 1389. Create Target Array in the Given Order
     * Easy
     * Topics
     * Companies
     * Hint
     * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
     * <p>
     * Initially target array is empty.
     * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
     * Repeat the previous step until there are no elements to read in nums and index.
     * Return the target array.
     * <p>
     * It is guaranteed that the insertion operations will be valid.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
     * Output: [0,4,1,3,2]
     * Explanation:
     * nums       index     target
     * 0            0        [0]
     * 1            1        [0,1]
     * 2            2        [0,1,2]
     * 3            2        [0,1,3,2]
     * 4            1        [0,4,1,3,2]
     * Example 2:
     * <p>
     * Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
     * Output: [0,1,2,3,4]
     * Explanation:
     * nums       index     target
     * 1            0        [1]
     * 2            1        [1,2]
     * 3            2        [1,2,3]
     * 4            3        [1,2,3,4]
     * 0            0        [0,1,2,3,4]
     * Example 3:
     * <p>
     * Input: nums = [1], index = [0]
     * Output: [1]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length, index.length <= 100
     * nums.length == index.length
     * 0 <= nums[i] <= 100
     * 0 <= index[i] <= i
     */

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[index.length];
        Arrays.fill(result, -1);
        for (int i = 0; i < result.length; i++) {
            if (result[index[i]] == -1) {
                result[index[i]] = nums[i];
            } else {
                for (int j = result.length - 1; j > index[i]; j--) {
                    result[j] = result[j - 1];
                }
                result[index[i]] = nums[i];
            }
        }
        return result;
    }
}
