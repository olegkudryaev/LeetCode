package com.leetcode.array.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class SortThePeople {

    /**
     2418. Sort the People
     Solved
     Easy
     Topics
     Companies
     Hint
     You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

     For each index i, names[i] and heights[i] denote the name and height of the ith person.

     Return names sorted in descending order by the people's heights.



     Example 1:

     Input: names = ["Mary","John","Emma"], heights = [180,165,170]
     Output: ["Mary","Emma","John"]
     Explanation: Mary is the tallest, followed by Emma and John.
     Example 2:

     Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
     Output: ["Bob","Alice","Bob"]
     Explanation: The first Bob is the tallest, followed by Alice and the second Bob.


     Constraints:

     n == names.length == heights.length
     1 <= n <= 103
     1 <= names[i].length <= 20
     1 <= heights[i] <= 105
     names[i] consists of lower and upper case English letters.
     All the values of heights are distinct.
     */
    public static String[] sortPeople(String[] names, int[] heights) {
//        TreeMap<Integer, String> map = new TreeMap<>();
//        for (int i = 0; i < heights.length; i++) {
//            map.put(heights[i], names[i]);
//        }
//        List<String> list = new java.util.ArrayList<>(map.values().stream().toList());
//        Collections.reverse(list);
//        for (int i = 0; i < names.length; i++) {
//            names[i] = list.get(i);
//        }
//        return names;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for (int i = 0; i < names.length; i++) {
            names[names.length - 1 - i] = map.get(heights[i]);
        }
        return names;

    }
}
