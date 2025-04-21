package com.leetcode.backtracking.medium;

public class ConstructSmallestNumberFromDIString {
    /**
     * 2375. Construct Smallest Number From DI String
     * Medium
     * Topics
     * Companies
     * Hint
     * You are given a 0-indexed string pattern of length n consisting of the characters 'I' meaning increasing and 'D' meaning decreasing.
     * <p>
     * A 0-indexed string num of length n + 1 is created using the following conditions:
     * <p>
     * num consists of the digits '1' to '9', where each digit is used at most once.
     * If pattern[i] == 'I', then num[i] < num[i + 1].
     * If pattern[i] == 'D', then num[i] > num[i + 1].
     * Return the lexicographically smallest possible string num that meets the conditions.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: pattern = "IIIDIDDD"
     * Output: "123549876"
     * Explanation:
     * At indices 0, 1, 2, and 4 we must have that num[i] < num[i+1].
     * At indices 3, 5, 6, and 7 we must have that num[i] > num[i+1].
     * Some possible values of num are "245639871", "135749862", and "123849765".
     * It can be proven that "123549876" is the smallest possible num that meets the conditions.
     * Note that "123414321" is not possible because the digit '1' is used more than once.
     * Example 2:
     * <p>
     * Input: pattern = "DDD"
     * Output: "4321"
     * Explanation:
     * Some possible values of num are "9876", "7321", and "8742".
     * It can be proven that "4321" is the smallest possible num that meets the conditions.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= pattern.length <= 8
     * pattern consists of only the letters 'I' and 'D'.
     */
    public static String smallestNumber(String pattern) {
        int n = pattern.length();
        int[] stuck = new int[n + 1];
        int index = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            stuck[index] = i + 1;
            index++;

            if(i == n || pattern.charAt(i) == 'I'){
                while (index > 0){
                    index--;
                    result.append(stuck[index]);
                }
            }
        }
        return result.toString();
    }
}
