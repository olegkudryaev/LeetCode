package com.leetcode.array.easy;

import java.util.HashMap;

public class CountTheNumberOfConsistentStrings {
    /**
     * 1684. Count the Number of Consistent Strings
     * Easy
     * Topics
     * Companies
     * Hint
     * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
     * <p>
     * Return the number of consistent strings in the array words.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
     * Output: 2
     * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
     * Example 2:
     * <p>
     * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
     * Output: 7
     * Explanation: All strings are consistent.
     * Example 3:
     * <p>
     * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
     * Output: 4
     * Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= words.length <= 104
     * 1 <= allowed.length <= 26
     * 1 <= words[i].length <= 10
     * The characters in allowed are distinct.
     * words[i] and allowed contain only lowercase English letters.
     */

    private static HashMap<Character, Boolean> map = new HashMap<>();
    private static Integer num = 0;

    public static int countConsistentStrings(String allowed, String[] words) {
        char[] charArray1 = allowed.toCharArray();
        for (char c : charArray1) {
            map.put(c, true);
        }

        for (int i = 0; i < words.length; i++) {
            Boolean check = check(words[i]);
            if(check){
                num++;
            }
        }
        return num;
    }

    static Boolean  check(String word) {
        for (char c : word.toCharArray()) {
            Boolean orDefault = map.getOrDefault(c, false);
            if (orDefault == false) {
                return false;
            }
        }
        return true;
    }
}
