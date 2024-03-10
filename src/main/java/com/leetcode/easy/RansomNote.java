package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    /**
     * 383. Ransom Note
     * Easy
     * Topics
     * Companies
     * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
     * <p>
     * Each letter in magazine can only be used once in ransomNote.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: ransomNote = "a", magazine = "b"
     * Output: false
     * Example 2:
     * <p>
     * Input: ransomNote = "aa", magazine = "ab"
     * Output: false
     * Example 3:
     * <p>
     * Input: ransomNote = "aa", magazine = "aab"
     * Output: true
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= ransomNote.length, magazine.length <= 105
     * ransomNote and magazine consist of lowercase English letters.
     */

    public static void main(String[] args) {
        System.out.println(canConstruct("aaaab", "aaaaab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magaz = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char r = magazine.charAt(i);
            int count = magaz.getOrDefault(r, 0);
            magaz.put(r, count + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int count = magaz.getOrDefault(r, 0);
            if (count == 0) {
                return false;
            }
            magaz.put(r, count - 1);
        }
        return true;
    }

}
