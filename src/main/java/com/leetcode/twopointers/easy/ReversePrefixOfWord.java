package com.leetcode.twopointers.easy;

public class ReversePrefixOfWord {
    /**
     * 2000. Reverse Prefix of Word
     * Easy
     * Topics
     * Companies
     * Hint
     * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
     * <p>
     * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
     * Return the resulting string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: word = "abcdefd", ch = "d"
     * Output: "dcbaefd"
     * Explanation: The first occurrence of "d" is at index 3.
     * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
     * Example 2:
     * <p>
     * Input: word = "xyxzxe", ch = "z"
     * Output: "zxyxxe"
     * Explanation: The first and only occurrence of "z" is at index 3.
     * Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
     * Example 3:
     * <p>
     * Input: word = "abcd", ch = "z"
     * Output: "abcd"
     * Explanation: "z" does not exist in word.
     * You should not do any reverse operation, the resulting string is "abcd".
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= word.length <= 250
     * word consists of lowercase English letters.
     * ch is a lowercase English letter.
     */
    public static String reversePrefix(String word, char ch) {
        char[] charArray = word.toCharArray();
        int i = word.indexOf(ch);
        if (i == 0) {
            return word;
        }

        StringBuilder result = new StringBuilder();

        for (int j = i; j >= 0; j--) {
            result.append(charArray[j]);
        }

        for (int j = i + 1; j < charArray.length; j++) {
            result.append(charArray[j]);
        }

        return result.toString();
    }
}
