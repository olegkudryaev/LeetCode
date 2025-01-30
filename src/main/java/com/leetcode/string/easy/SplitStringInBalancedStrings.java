package com.leetcode.string.easy;

public class SplitStringInBalancedStrings {

    /**
     * 1221. Split a String in Balanced Strings
     * Easy
     * Topics
     * Companies
     * Hint
     * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
     * <p>
     * Given a balanced string s, split it into some number of substrings such that:
     * <p>
     * Each substring is balanced.
     * Return the maximum number of balanced strings you can obtain.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "RLRRLLRLRL"
     * Output: 4
     * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
     * Example 2:
     * <p>
     * Input: s = "RLRRRLLRLL"
     * Output: 2
     * Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
     * Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
     * Example 3:
     * <p>
     * Input: s = "LLLLRRRR"
     * Output: 1
     * Explanation: s can be split into "LLLLRRRR".
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= s.length <= 1000
     * s[i] is either 'L' or 'R'.
     * s is a balanced string.
     */
    public static int balancedStringSplit(String s) {
        char[] charArray = s.toCharArray();
        int balance = 0;
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] == 'R')) {
                balance++;
            }
            if ((charArray[i] == 'L')) {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }
        return count;
    }
}
