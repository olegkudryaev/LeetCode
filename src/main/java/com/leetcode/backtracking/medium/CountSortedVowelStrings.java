package com.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

public class CountSortedVowelStrings {
    /**
     * 1641. Count Sorted Vowel Strings
     * Medium
     * Topics
     * Companies
     * Hint
     * Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.
     * <p>
     * A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 1
     * Output: 5
     * Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].
     * Example 2:
     * <p>
     * Input: n = 2
     * Output: 15
     * Explanation: The 15 sorted strings that consist of vowels only are
     * ["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
     * Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.
     * Example 3:
     * <p>
     * Input: n = 33
     * Output: 66045
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 50
     */


    static int a=1, e=1, i=1, o=1, u=1;
    public static int countVowelStrings(int n) {
        for(int j=1; j<n; j++){
            increment();
        }
        return a+e+i+o+u;
    }

    private static void increment() {
        a = a+e+i+o+u;
        e = e+i+o+u;
        i = i+o+u;
        o = o+u;
    }
}
