package com.leetcode.string;

public class PermutationDifferenceBetweenTwoStrings {

    /**
     * 3146. Permutation Difference between Two Strings
     * Easy
     * Topics
     * Companies
     * Hint
     * You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.
     * <p>
     * The permutation difference between s and t is defined as the sum of the absolute difference between the index of the occurrence of each character in s and the index of the occurrence of the same character in t.
     * <p>
     * Return the permutation difference between s and t.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "abc", t = "bac"
     * <p>
     * Output: 2
     * <p>
     * Explanation:
     * <p>
     * For s = "abc" and t = "bac", the permutation difference of s and t is equal to the sum of:
     * <p>
     * The absolute difference between the index of the occurrence of "a" in s and the index of the occurrence of "a" in t.
     * The absolute difference between the index of the occurrence of "b" in s and the index of the occurrence of "b" in t.
     * The absolute difference between the index of the occurrence of "c" in s and the index of the occurrence of "c" in t.
     * That is, the permutation difference between s and t is equal to |0 - 1| + |1 - 0| + |2 - 2| = 2.
     * <p>
     * Example 2:
     * <p>
     * Input: s = "abcde", t = "edbac"
     * <p>
     * Output: 12
     * <p>
     * Explanation: The permutation difference between s and t is equal to |0 - 3| + |1 - 2| + |2 - 4| + |3 - 1| + |4 - 0| = 12.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 26
     * Each character occurs at most once in s.
     * t is a permutation of s.
     * s consists only of lowercase English letters.
     */
    public static int findPermutationDifference(String s, String t) {

        /**
         * Лучшее решение
         * int ans = 0;
         *
         *         for(int i=0; i<s.length(); i++){
         *             int n = Math.abs(i-t.indexOf(s.charAt(i)));
         *             ans = ans + n;
         *         }
         *
         *         return ans;
         * */

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = findPlace(s.charAt(i), t);
            count += Math.abs(i - temp);
        }
        return count;
    }

    private static int findPlace(char c, String t) {
        for (int i = 0; i < t.length(); i++) {
            if (c == t.charAt(i)) {
                return i;
            }
        }
        return 0;
    }
}
