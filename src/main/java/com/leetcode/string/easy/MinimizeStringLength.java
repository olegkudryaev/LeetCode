package com.leetcode.string.easy;

import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength {

    /**
     * 2716. Minimize String Length
     * Easy
     * Topics
     * Companies
     * Hint
     * Given a string s, you have two types of operation:
     * <p>
     * Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the left of i (if exists).
     * Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the right of i (if exists).
     * Your task is to minimize the length of s by performing the above operations zero or more times.
     * <p>
     * Return an integer denoting the length of the minimized string.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "aaabc"
     * <p>
     * Output: 3
     * <p>
     * Explanation:
     * <p>
     * Operation 2: we choose i = 1 so c is 'a', then we remove s[2] as it is closest 'a' character to the right of s[1].
     * s becomes "aabc" after this.
     * Operation 1: we choose i = 1 so c is 'a', then we remove s[0] as it is closest 'a' character to the left of s[1].
     * s becomes "abc" after this.
     * Example 2:
     * <p>
     * Input: s = "cbbd"
     * <p>
     * Output: 3
     * <p>
     * Explanation:
     * <p>
     * Operation 1: we choose i = 2 so c is 'b', then we remove s[1] as it is closest 'b' character to the left of s[1].
     * s becomes "cbd" after this.
     * Example 3:
     * <p>
     * Input: s = "baadccab"
     * <p>
     * Output: 4
     * <p>
     * Explanation:
     * <p>
     * Operation 1: we choose i = 6 so c is 'a', then we remove s[2] as it is closest 'a' character to the left of s[6].
     * s becomes "badccab" after this.
     * Operation 2: we choose i = 0 so c is 'b', then we remove s[6] as it is closest 'b' character to the right of s[0].
     * s becomes "badcca" fter this.
     * Operation 2: we choose i = 3 so c is 'c', then we remove s[4] as it is closest 'c' character to the right of s[3].
     * s becomes "badca" after this.
     * Operation 1: we choose i = 4 so c is 'a', then we remove s[1] as it is closest 'a' character to the left of s[4].
     * s becomes "bdca" after this.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 100
     * s contains only lowercase English letters
     */
    public static int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
}
