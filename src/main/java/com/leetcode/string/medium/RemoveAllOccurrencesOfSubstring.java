package com.leetcode.string.medium;

public class RemoveAllOccurrencesOfSubstring {
    /**
     * 1910. Remove All Occurrences of a Substring
     * Medium
     * Topics
     * Companies
     * Hint
     * Given two strings s and part, perform the following operation on s until all occurrences of the substring part are removed:
     * <p>
     * Find the leftmost occurrence of the substring part and remove it from s.
     * Return s after removing all occurrences of part.
     * <p>
     * A substring is a contiguous sequence of characters in a string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "daabcbaabcbc", part = "abc"
     * Output: "dab"
     * Explanation: The following operations are done:
     * - s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
     * - s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
     * - s = "dababc", remove "abc" starting at index 3, so s = "dab".
     * Now s has no occurrences of "abc".
     * Example 2:
     * <p>
     * Input: s = "axxxxyyyyb", part = "xy"
     * Output: "ab"
     * Explanation: The following operations are done:
     * - s = "axxxxyyyyb", remove "xy" starting at index 4 so s = "axxxyyyb".
     * - s = "axxxyyyb", remove "xy" starting at index 3 so s = "axxyyb".
     * - s = "axxyyb", remove "xy" starting at index 2 so s = "axyb".
     * - s = "axyb", remove "xy" starting at index 1 so s = "ab".
     * Now s has no occurrences of "xy".
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 1000
     * 1 <= part.length <= 1000
     * s​​​​​​ and part consists of lowercase English letters.
     */
    public static String removeOccurrences(String s, String part) {
//        int l = part.length();
//        while (s.indexOf(part) != -1) {
//            int i = s.indexOf(part);
//            s = s.substring(0, i) + s.substring(i + l);
//        }
//        return s;

        int first = s.length();
        int second = -1;
        while (first != second) {
            first = s.length();
            s = s.replaceFirst(part, "");
            second = s.length();
        }
        return s;
    }
}

