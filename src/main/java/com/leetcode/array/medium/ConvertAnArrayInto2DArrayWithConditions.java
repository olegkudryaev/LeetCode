package com.leetcode.array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertAnArrayInto2DArrayWithConditions {
    /**
     * 2610. Convert an Array Into a 2D Array With Conditions
     * Medium
     * Topics
     * Companies
     * Hint
     * You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:
     * <p>
     * The 2D array should contain only the elements of the array nums.
     * Each row in the 2D array contains distinct integers.
     * The number of rows in the 2D array should be minimal.
     * Return the resulting array. If there are multiple answers, return any of them.
     * <p>
     * Note that the 2D array can have a different number of elements on each row.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,3,4,1,2,3,1]
     * Output: [[1,3,4,2],[1,3],[1]]
     * Explanation: We can create a 2D array that contains the following rows:
     * - 1,3,4,2
     * - 1,3
     * - 1
     * All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
     * It can be shown that we cannot have less than 3 rows in a valid array.
     * Example 2:
     * <p>
     * Input: nums = [1,2,3,4]
     * Output: [[4,3,2,1]]
     * Explanation: All elements of the array are distinct, so we can keep all of them in the first row of the 2D array.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 200
     * 1 <= nums[i] <= nums.length
     */

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        HashMap<Integer, Integer> numsMapCopy = new HashMap<>();
//        int[] input = {1, 3, 4, 1, 2, 3, 1};
//        int[][] output = {{1, 3, 4, 2}, {1, 3}, {1}};
        for (int num : nums) {
            numsMap.merge(num, 1, Integer::sum);
            numsMapCopy.merge(num, 1, Integer::sum);
        }

        while (numsMap != null) {
            List<Integer> forResult = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : numsMapCopy.entrySet()) {
                int k = entry.getKey();
                int v = entry.getValue();
                if (v > 0) {
                    forResult.add(k);
                }
                v = v - 1;
                numsMapCopy.put(k, v);
                if (v == 0) {
                    numsMap.remove(k);
                }
            }
            if (numsMap.isEmpty()) {
                numsMap = null;
            }
            result.add(forResult);
        }
        return result;
//        Map<Integer, Integer> um = new HashMap<>();
//        for (int i : nums) {
//            um.put(i, um.getOrDefault(i, 0) + 1);
//        }
//        List<List<Integer>> ans = new ArrayList<>();
//        while (!um.isEmpty()) {
//            List<Integer> temp = new ArrayList<>();
//            List<Integer> toErase = new ArrayList<>();
//            for (Map.Entry<Integer, Integer> entry : um.entrySet()) {
//                int f = entry.getKey();
//                int s = entry.getValue();
//                temp.add(f);
//                s--;
//                if (s == 0) {
//                    toErase.add(f);
//                }
//                um.put(f, s);
//            }
//            ans.add(temp);
//            for (int i : toErase) {
//                um.remove(i);
//            }
//        }
//        return ans;
    }
}
