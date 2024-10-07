package com.leetcode.string.easy;

import java.util.HashMap;

public class JewelsAndStones {

    /**
     * 771. Jewels and Stones
     * Easy
     * Topics
     * Companies
     * Hint
     * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
     * <p>
     * Letters are case sensitive, so "a" is considered a different type of stone from "A".
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: jewels = "aA", stones = "aAAbbbb"
     * Output: 3
     * Example 2:
     * <p>
     * Input: jewels = "z", stones = "ZZ"
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= jewels.length, stones.length <= 50
     * jewels and stones consist of only English letters.
     * All the characters of jewels are unique.
     */

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
//        1 решение
//        for (int i = 0; i < stones.length(); i++) {
//            char c = stones.charAt(i);
//            if (method(c, jewels)){
//                count += 1;
//            }
//        }

//        2 решение
//        HashMap<Character, Character> map = createMap(jewels);
//        for (int i = 0; i < stones.length(); i++) {
//            Boolean c = map.containsKey(stones.charAt(i));
//            if(Boolean.TRUE.equals(c)){
//                count++;
//            }
//        }

        char[] stonesArray = stones.toCharArray();
        char[] jewelsArray = jewels.toCharArray();

        for (char stone : stonesArray) {
            for (char jewel : jewelsArray) {
                if (stone == jewel) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    private static HashMap<Character, Character> createMap(String jewels){
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            map.put(jewels.charAt(i), jewels.charAt(i));
        }
        return map;
    }

    private static boolean method(char c, String jewels) {
        for (int i = 0; i < jewels.length(); i++) {
            if(jewels.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
}
