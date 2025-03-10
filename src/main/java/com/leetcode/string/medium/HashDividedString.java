package com.leetcode.string.medium;

public class HashDividedString {

    public static String stringHash(String s, int k) {
        int n = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i += k) {
            int curr = 0;
            for (int j = i; j < i + k; j++) {
                curr += s.charAt(j) - 'a';
            }
            curr %= 26;
            char c = (char) ('a' + curr);
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
