package com.leetcode.string.medium;

public class NumberOfPairsOfStringsWithConcatenationEqualToTarget {

    /**
     * 2023. Number of Pairs of Strings With Concatenation Equal to Target
     * Medium
     * Topics
     * Companies
     * Hint
     * Given an array of digit strings nums and a digit string target, return the number of pairs of indices (i, j) (where i != j) such that the concatenation of nums[i] + nums[j] equals target.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = ["777","7","77","77"], target = "7777"
     * Output: 4
     * Explanation: Valid pairs are:
     * - (0, 1): "777" + "7"
     * - (1, 0): "7" + "777"
     * - (2, 3): "77" + "77"
     * - (3, 2): "77" + "77"
     * Example 2:
     * <p>
     * Input: nums = ["123","4","12","34"], target = "1234"
     * Output: 2
     * Explanation: Valid pairs are:
     * - (0, 1): "123" + "4"
     * - (2, 3): "12" + "34"
     * Example 3:
     * <p>
     * Input: nums = ["1","1","1"], target = "11"
     * Output: 6
     * Explanation: Valid pairs are:
     * - (0, 1): "1" + "1"
     * - (1, 0): "1" + "1"
     * - (0, 2): "1" + "1"
     * - (2, 0): "1" + "1"
     * - (1, 2): "1" + "1"
     * - (2, 1): "1" + "1"
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= nums.length <= 100
     * 1 <= nums[i].length <= 100
     * 2 <= target.length <= 100
     * nums[i] and target consist of digits.
     * nums[i] and target do not have leading zeros.
     */
    public static int numOfPairs(String[] nums, String target) {
        String expect = new String(target);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String result = nums[i];
            for (int j = 0; j < nums.length; j++) {
                String append = result + nums[j];
                if (i == j) {
                    continue;
                } else if (expect.equals(append)) {
                    count++;
                }
            }
        }
        return count;
    }
}
