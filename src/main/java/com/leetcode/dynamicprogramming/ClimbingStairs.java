package com.leetcode.dynamicprogramming;

public class ClimbingStairs {

    /**
     * 70. Climbing Stairs
     * Easy
     * Topics
     * Companies
     * Hint
     * You are climbing a staircase. It takes n steps to reach the top.
     * <p>
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     * Example 2:
     * <p>
     * Input: n = 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 45
     */

    public static int climbStairs(int n) {
        if (n == 1) {
            return n;
        }

        int[] count = new int[n + 1];
        count[1] = 1;
        count[2] = 2;

        for (int i = 3; i < count.length; i++) {
            count[i] = count[i-1] + count[i-2];
        }
        return count[n];
    }
}
