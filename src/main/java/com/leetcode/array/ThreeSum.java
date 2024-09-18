package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ThreeSum {
    /**
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such
     * that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     * <p>
     * Notice that the solution set must not contain duplicate triplets.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     * Explanation:
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     * The distinct triplets are [-1,0,1] and [-1,-1,2].
     * Notice that the order of the output and the order of the triplets does not matter.
     * Example 2:
     * <p>
     * Input: nums = [0,1,1]
     * Output: []
     * Explanation: The only possible triplet does not sum up to 0.
     * Example 3:
     * <p>
     * Input: nums = [0,0,0]
     * Output: [[0,0,0]]
     * Explanation: The only possible triplet sums up to 0.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 3 <= nums.length <= 3000
     * -105 <= nums[i] <= 105
     */

//    public static List<List<Integer>> threeSum(int[] nums) {
//        int num1 = 0;
//        int num2 = 0;
//        int num3 = 0;
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            num1 = nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                if (i == j) {
//                    break;
//                }
//                num2 = nums[j];
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (i == k || j == k) {
//                        break;
//                    }
//                    num3 = nums[k];
//                    if ((num1 + num2 + num3) == 0) {
//                        List<Integer> expect = List.of(num1, num2, num3);
//                        List<Integer> list = expect.stream().sorted().toList();
//                        result.add(list);
//                    }
//                }
//            }
//        }
//        List<List<Integer>> list = result.stream().distinct().toList();
//        return list;
//    }
    public static List<List<Integer>> threeSum(int[] nums) {
        //{-1, 0, 1, 2, -1, -4}
        int[] sortedArray = Arrays.stream(nums).sorted().toArray();
        //{-4, -1, -1, 0, 1, 2}
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < sortedArray.length; i++) {
            int left = i + 1;
            int right = sortedArray.length - 1;
            if (i > 0 && sortedArray[i] == sortedArray[i - 1]) {
                continue;
            }
            while (left < right) {
                int sum = sortedArray[i] + sortedArray[left] + sortedArray[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    result.add(List.of(sortedArray[i], sortedArray[left], sortedArray[right]));
                    do {
                        left++;
                    } while (left < right && sortedArray[left] == sortedArray[left - 1]);
                }
            }
        }
        return result;
    }
}
