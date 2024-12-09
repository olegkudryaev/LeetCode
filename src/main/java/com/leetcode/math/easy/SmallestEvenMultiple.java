package com.leetcode.math.easy;

public class SmallestEvenMultiple {
    /**
     * 2413. Smallest Even Multiple
     * Easy
     * Topics
     * Companies
     * Hint
     * Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 5
     * Output: 10
     * Explanation: The smallest multiple of both 5 and 2 is 10.
     * Example 2:
     * <p>
     * Input: n = 6
     * Output: 6
     * Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 150
     *
     * @param n
     * @return
     */
    public static int smallestEvenMultiple(int n) {
        int num = 2;
        if (n % num == 0) {
            return n;
        } else {
            return n * num;
        }
    }
}
