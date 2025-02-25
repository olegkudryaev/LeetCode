package com.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringsWithoutAdjacentZeros {
    /**
     * 3211. Generate Binary Strings Without Adjacent Zeros
     * Medium
     * Topics
     * Companies
     * Hint
     * You are given a positive integer n.
     * <p>
     * A binary string x is valid if all
     * substrings
     * of x of length 2 contain at least one "1".
     * <p>
     * Return all valid strings with length n, in any order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 3
     * <p>
     * Output: ["010","011","101","110","111"]
     * <p>
     * Explanation:
     * <p>
     * The valid strings of length 3 are: "010", "011", "101", "110", and "111".
     * <p>
     * Example 2:
     * <p>
     * Input: n = 1
     * <p>
     * Output: ["0","1"]
     * <p>
     * Explanation:
     * <p>
     * The valid strings of length 1 are: "0" and "1".
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 18
     */

    static char one = '1';
    static char zero = '0';
    static boolean flag = false;
    static List<String> ans = new ArrayList<>();
    static StringBuilder subans = new StringBuilder("");

    public static void genbin(int n, int i) {
        if (subans.length() == n) {
            ans.add(subans.toString());
            return;
        }

        if (flag || i == 0) {
            flag = false;
            subans.append(zero);
            i = i + 1;
            genbin(n, i);
            subans.deleteCharAt(subans.length() - 1);
        }
        flag = true;
        subans.append(one);
        i = i + 1;
        genbin(n, i);
        subans.deleteCharAt(subans.length() - 1);
    }

    public static List<String> validStrings(int n) {
        genbin(n, 0);
        return ans;
    }
}
