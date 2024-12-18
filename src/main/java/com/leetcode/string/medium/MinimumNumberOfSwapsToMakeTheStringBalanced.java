package com.leetcode.string.medium;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {

    /**
     * 1963. Minimum Number of Swaps to Make the String Balanced
     * Medium
     * Topics
     * Companies
     * Hint
     * You are given a 0-indexed string s of even length n. The string consists of exactly n / 2 opening brackets '[' and n / 2 closing brackets ']'.
     * <p>
     * A string is called balanced if and only if:
     * <p>
     * It is the empty string, or
     * It can be written as AB, where both A and B are balanced strings, or
     * It can be written as [C], where C is a balanced string.
     * You may swap the brackets at any two indices any number of times.
     * <p>
     * Return the minimum number of swaps to make s balanced.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "][]["
     * Output: 1
     * Explanation: You can make the string balanced by swapping index 0 with index 3.
     * The resulting string is "[[]]".
     * Example 2:
     * <p>
     * Input: s = "]]][[["
     * Output: 2
     * Explanation: You can do the following to make the string balanced:
     * - Swap index 0 with index 4. s = "[]][][".
     * - Swap index 1 with index 5. s = "[[][]]".
     * The resulting string is "[[][]]".
     * Example 3:
     * <p>
     * Input: s = "[]"
     * Output: 0
     * Explanation: The string is already balanced.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == s.length
     * 2 <= n <= 106
     * n is even.
     * s[i] is either '[' or ']'.
     * The number of opening brackets '[' equals n / 2, and the number of closing brackets ']' equals n / 2.
     */
    public static int minSwaps(String s) {
        int count = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                count--;
            } else {
                count++;
            }
            balance = Math.max(balance, count);
        }
        return (balance + 1) / 2;
    }
}
//[]][][  [[][]]