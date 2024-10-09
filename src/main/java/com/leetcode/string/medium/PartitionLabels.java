package com.leetcode.string.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {
    /**
     * 763. Partition Labels
     * Medium
     * Topics
     * Companies
     * Hint
     * You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
     * <p>
     * Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
     * <p>
     * Return a list of integers representing the size of these parts.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "ababcbacadefegdehijhklij"
     * Output: [9,7,8]
     * Explanation:
     * The partition is "ababcbaca", "defegde", "hijhklij".
     * This is a partition so that each letter appears in at most one part.
     * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
     * Example 2:
     * <p>
     * Input: s = "eccbbbbdec"
     * Output: [10]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= s.length <= 500
     * s consists of lowercase English letters.
     */
    public static List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        Integer min = -1;
        Integer max = 0;
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, map.get(s.charAt(i)));
            if (max == i) {
                result.add(max - min);
                min = max;
            }
        }

        return result;
    }
}
