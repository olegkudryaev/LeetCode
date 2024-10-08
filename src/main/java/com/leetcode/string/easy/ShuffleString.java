package com.leetcode.string.easy;

public class ShuffleString {
    /**
     * 1528. Shuffle String
     * Solved
     * Easy
     * Topics
     * Companies
     * Hint
     * You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
     * <p>
     * Return the shuffled string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
     * Output: "leetcode"
     * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
     * Example 2:
     * <p>
     * Input: s = "abc", indices = [0,1,2]
     * Output: "abc"
     * Explanation: After shuffling, each character remains in its position.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * s.length == indices.length == n
     * 1 <= n <= 100
     * s consists of only lowercase English letters.
     * 0 <= indices[i] < n
     * All values of indices are unique.
     */
    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[indices[i]] = s.charAt(i);
        }
        return new String(chars);
    }
}
