package com.leetcode.string.easy;

import java.util.HashMap;

public class IsomorphicStrings {

    /**
     * 205. Isomorphic Strings
     * Easy
     * Topics
     * Companies
     * Given two strings s and t, determine if they are isomorphic.
     * <p>
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * <p>
     * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "egg", t = "add"
     * <p>
     * Output: true
     * <p>
     * Explanation:
     * <p>
     * The strings s and t can be made identical by:
     * <p>
     * Mapping 'e' to 'a'.
     * Mapping 'g' to 'd'.
     * Example 2:
     * <p>
     * Input: s = "foo", t = "bar"
     * <p>
     * Output: false
     * <p>
     * Explanation:
     * <p>
     * The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
     * <p>
     * Example 3:
     * <p>
     * Input: s = "paper", t = "title"
     * <p>
     * Output: true
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 5 * 104
     * t.length == s.length
     * s and t consist of any valid ascii character.
     */
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (!map1.containsKey(ch1)) {
                map1.put(ch1, ch2);
            }
            if (!map2.containsKey(ch2)) {
                map2.put(ch2, ch1);
            }
            if (map1.get(ch1) != ch2 || map2.get(ch2) != ch1) return false;
        }
        return true;
    }
}
