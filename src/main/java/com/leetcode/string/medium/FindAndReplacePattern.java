package com.leetcode.string.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {

    /**
     * 890. Find and Replace Pattern
     * Medium
     * Topics
     * Companies
     * Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.
     * <p>
     * A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
     * <p>
     * Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
     * Output: ["mee","aqq"]
     * Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
     * "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.
     * Example 2:
     * <p>
     * Input: words = ["a","b","c"], pattern = "a"
     * Output: ["a","b","c"]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= pattern.length <= 20
     * 1 <= words.length <= 50
     * words[i].length == pattern.length
     * pattern and words[i] are lowercase English letters.
     */
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            char[] charArray = words[i].toCharArray();
            if(check(charArray, pattern)){
                result.add(words[i]);
            }
        }
        return result;
    }

    private static boolean check(char[] charArray, String pattern) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        char[] charArray1 = pattern.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char pat = charArray1[i];
            char arr = charArray[i];

            if(!map1.containsKey(pat)){
                map1.put(pat, arr);
            }

            if(!map2.containsKey(arr)){
                map2.put(arr, pat);
            }
            if (map1.get(pat) != arr || map2.get(arr) != pat) return false;
        }
        return true;
    }
}
