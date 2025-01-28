package com.leetcode.math.easy;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    /**
     * 1281. Subtract the Product and Sum of Digits of an Integer
     * Easy
     * Topics
     * Companies
     * Hint
     * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 234
     * Output: 15
     * Explanation:
     * Product of digits = 2 * 3 * 4 = 24
     * Sum of digits = 2 + 3 + 4 = 9
     * Result = 24 - 9 = 15
     * Example 2:
     * <p>
     * Input: n = 4421
     * Output: 21
     * Explanation:
     * Product of digits = 4 * 4 * 2 * 1 = 32
     * Sum of digits = 4 + 4 + 2 + 1 = 11
     * Result = 32 - 11 = 21
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 10^5
     */
    public static int subtractProductAndSum(int n) {
        char[] charArray = Integer.valueOf(n).toString().toCharArray();
        int first = charArray[0] - '0';
        int second = charArray[0] - '0';

        for (int i = 1; i < charArray.length; i++) {
            first *= charArray[i] - '0';
            second += charArray[i] - '0';
        }
        System.out.println(first);
        return first - second;
    }
}
