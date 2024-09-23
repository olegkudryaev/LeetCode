package com.leetcode.binary;

public class CountingBits {
    /**
     * 338. Counting Bits
     * Easy
     * Topics
     * Companies
     * Hint
     * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 2
     * Output: [0,1,1]
     * Explanation:
     * 0 --> 0
     * 1 --> 1
     * 2 --> 10
     * Example 2:
     * <p>
     * Input: n = 5
     * Output: [0,1,1,2,1,2]
     * Explanation:
     * 0 --> 0
     * 1 --> 1
     * 2 --> 10
     * 3 --> 11
     * 4 --> 100
     * 5 --> 101
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 0 <= n <= 105
     * <p>
     * <p>
     * Follow up:
     * <p>
     * It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?
     * Can you do it without using any built-in function (i.e., like __builtin_popcount in C++)?
     */
    public static int[] countBits(int n) {
        int nums[];
        nums = new int[n + 1];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int num = i;
            do {
                count += (num & 1);
                num = num >> 1;
            } while (num != 0);
            nums[i] = count;
        }
        return nums;
    }
}
