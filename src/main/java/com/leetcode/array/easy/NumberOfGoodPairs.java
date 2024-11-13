package com.leetcode.array.easy;

import java.util.Arrays;

public class NumberOfGoodPairs {
    /**
     * 1512. Number of Good Pairs
     * Easy
     * Topics
     * Companies
     * Hint
     * Given an array of integers nums, return the number of good pairs.
     * <p>
     * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,1,1,3]
     * Output: 4
     * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
     * Example 2:
     * <p>
     * Input: nums = [1,1,1,1]
     * Output: 6
     * Explanation: Each pair in the array are good.
     * Example 3:
     * <p>
     * Input: nums = [1,2,3]
     * Output: 0
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 100
     * 1 <= nums[i] <= 100
     */
    public static int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j] && i < j) {
//                    count++;
//                }
//            }
//        }
//        return count;
        Arrays.sort(nums);
        int count=1;
        int goodPair=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]-nums[i+1]!=0){
                goodPair+=(count*(count-1))/2;
                count=1;
            }
            else{
                count++;
            }
        }
        goodPair+=(count*(count-1))/2;
        return goodPair;
    }
}
