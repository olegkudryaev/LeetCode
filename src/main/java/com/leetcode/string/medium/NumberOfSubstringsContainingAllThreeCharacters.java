package com.leetcode.string.medium;

import java.util.HashMap;

public class NumberOfSubstringsContainingAllThreeCharacters {
    /**
     * 1358. Number of Substrings Containing All Three Characters
     * Medium
     * Topics
     * Companies
     * Hint
     * Given a string s consisting only of characters a, b and c.
     * <p>
     * Return the number of substrings containing at least one occurrence of all these characters a, b and c.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "abcabc"
     * Output: 10
     * Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).
     * Example 2:
     * <p>
     * Input: s = "aaacb"
     * Output: 3
     * Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb".
     * Example 3:
     * <p>
     * Input: s = "abc"
     * Output: 1
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 3 <= s.length <= 5 x 10^4
     * s only consists of a, b or c characters.
     */
    public static int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int start = 0;
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int end = 0; end < n; end++) {
            // Включаем текущий символ в окно
            charCount.put(s.charAt(end), charCount.getOrDefault(s.charAt(end), 0) + 1);

            // Проверяем, есть ли хотя бы по одному из каждого символа
            while (charCount.getOrDefault('a', 0) > 0 &&
                    charCount.getOrDefault('b', 0) > 0 &&
                    charCount.getOrDefault('c', 0) > 0) {
                // Если есть, считаем все подстроки от start до end
                count += n - end;

                // Перемещаем start, чтобы попробовать найти меньшую валидную подстроку
                charCount.put(s.charAt(start), charCount.get(s.charAt(start)) - 1);
                if (charCount.get(s.charAt(start)) == 0) {
                    charCount.remove(s.charAt(start));
                }
                start++;
            }
        }

        return count;
    }
}
