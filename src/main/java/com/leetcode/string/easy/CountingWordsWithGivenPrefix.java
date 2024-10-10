package com.leetcode.string.easy;

public class CountingWordsWithGivenPrefix {

    /**
     * 2185. Counting Words With a Given Prefix
     * You are given an array of strings words and a string pref.
     * <p>
     * Return the number of strings in words that contain pref as a prefix.
     * <p>
     * A prefix of a string s is any leading contiguous substring of s.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: words = ["pay","attention","practice","attend"], pref = "at"
     * Output: 2
     * Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
     * Example 2:
     * <p>
     * Input: words = ["leetcode","win","loops","success"], pref = "code"
     * Output: 0
     * Explanation: There are no strings that contain "code" as a prefix.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= words.length <= 100
     * 1 <= words[i].length, pref.length <= 100
     * words[i] and pref consist of lowercase English letters.
     */

    public static int prefixCount(String[] words, String pref) {
//        int count = 0;
//
//        for (String word : words) {
//            String substring = "";
//            if (word.length() >= pref.length()) {
//                substring = word.substring(0, pref.length());
//            }
//            if (substring.equals(pref)) {
//                count++;
//            }
//        }
//
//        return count;

        int count = 0;

        for (String word : words){
            if(word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}
