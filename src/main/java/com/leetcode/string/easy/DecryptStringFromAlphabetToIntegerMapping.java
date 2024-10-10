package com.leetcode.string.easy;

import java.util.HashMap;

public class DecryptStringFromAlphabetToIntegerMapping {

    /**
     *1309. Decrypt String from Alphabet to Integer Mapping
     * Solved
     * Easy
     * Topics
     * Companies
     * Hint
     * You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
     *
     * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
     * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
     * Return the string formed after mapping.
     *
     * The test cases are generated so that a unique mapping will always exist.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "10#11#12"
     * Output: "jkab"
     * Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
     * Example 2:
     *
     * Input: s = "1326#"
     * Output: "acz"
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 1000
     * s consists of digits and the '#' letter.
     * s will be a valid string such that mapping is always possible.
     */
    public static String freqAlphabets(String s) {

        HashMap<Integer, String> map = createMap();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                String substring = s.substring(i - 2, i);
                Integer i1 = Integer.valueOf(substring);
                stringBuilder.append(map.get(i1));
                i = i - 2;
            } else {
                int numericValue = Character.getNumericValue(s.charAt(i));
                String string = map.get(numericValue);
                stringBuilder.append(string);
            }
        }
        StringBuilder reverse = stringBuilder.reverse();
        return reverse.toString();

//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if(s.charAt(i) == '#'){
//                String string = s.substring(i-2, i);
//                Integer integer = Integer.valueOf(string);
//                char ch = (char) ('a' + integer - 1);
//                stringBuilder.append(ch);
//                i=i-2;
//            } else {
//                int number = s.charAt(i)-'0';
//                char c = (char) ('a' + number - 1);
//                stringBuilder.append(c);
//            }
//        }
//        return stringBuilder.reverse().toString();
    }

    private static HashMap<Integer, String> createMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");
        map.put(7, "g");
        map.put(8, "h");
        map.put(9, "i");
        map.put(10, "j");
        map.put(11, "k");
        map.put(12, "l");
        map.put(13, "m");
        map.put(14, "n");
        map.put(15, "o");
        map.put(16, "p");
        map.put(17, "q");
        map.put(18, "r");
        map.put(19, "s");
        map.put(20, "t");
        map.put(21, "u");
        map.put(22, "v");
        map.put(23, "w");
        map.put(24, "x");
        map.put(25, "y");
        map.put(26, "z");
        return map;
    }
}
