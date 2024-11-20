package com.leetcode.string.easy;

import java.util.StringJoiner;

public class ConvertDateToBinary {
    /**
     * 3280. Convert Date to Binary
     * Easy
     * Topics
     * Companies
     * You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format.
     * <p>
     * date can be written in its binary representation obtained by converting year, month, and day to their binary representations without any leading zeroes and writing them down in year-month-day format.
     * <p>
     * Return the binary representation of date.
     */
    public static String convertDateToBinary(String date) {
        String[] split = date.split("-");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            String binaryString = Integer.toBinaryString(Integer.parseInt(split[i]));
            sb.append(binaryString);
            if (i < split.length - 1) {
                sb.append("-"); // Добавляем разделитель, если это не последняя строка
            }
        }
        return sb.toString();
    }
}
