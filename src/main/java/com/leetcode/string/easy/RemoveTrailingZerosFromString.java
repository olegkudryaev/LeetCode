package com.leetcode.string.easy;

public class RemoveTrailingZerosFromString {
    public static String removeTrailingZeros(String num) {
        int right = num.length()-1;
        while (num.charAt(right) == '0') right--;

        return num.substring(0, right+1);
    }
}
