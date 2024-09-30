package com.leetcode.string;

public class ScoreOfString {

    /**
     * 3110. Score of a String
     * Easy
     * Topics
     * Companies
     * Hint
     * You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
     * <p>
     * Return the score of s.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "hello"
     * <p>
     * Output: 13
     * <p>
     * Explanation:
     * <p>
     * The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
     * <p>
     * Example 2:
     * <p>
     * Input: s = "zaz"
     * <p>
     * Output: 50
     * <p>
     * Explanation:
     * <p>
     * The ASCII values of the characters in s are: 'z' = 122, 'a' = 97. So, the score of s would be |122 - 97| + |97 - 122| = 25 + 25 = 50.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= s.length <= 100
     * s consists only of lowercase English letters.
     */

    public static int scoreOfString(String s) {
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            int number = s.charAt(i);
            int previousNumber = s.charAt(i - 1);
            result += getPlusNumberOnly(number, previousNumber);
        }
        return result;
    }

    private static int getPlusNumberOnly(int number, int previousNumber) {
        //Math.abs(number - previousNumber);
        int result = number - previousNumber;
        return (result < 0) ? -result : result;
    }
}
