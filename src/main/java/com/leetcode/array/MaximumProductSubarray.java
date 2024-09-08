package com.leetcode.array;

public class MaximumProductSubarray {

    /**
     * 152. Maximum Product Subarray
     * Medium
     * Topics
     * Companies
     * Given an integer array nums, find a
     * subarray
     * that has the largest product, and return the product.
     * <p>
     * The test cases are generated so that the answer will fit in a 32-bit integer.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,3,-2,4]
     * Output: 6
     * Explanation: [2,3] has the largest product 6.
     * Example 2:
     * <p>
     * Input: nums = [-2,0,-1]
     * Output: 0
     * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 2 * 104
     * -10 <= nums[i] <= 10
     * The product of any subarray of nums is guaranteed to fit in a 32-bit integer.
     */

    public static void main(String[] args) {
        int[] nums = {-2}; //-2
        int[] nums2 = {-2, 3, -4, 2, 2}; //96
        int[] nums3 = {2, 3, -2, 4}; //6
        int[] nums4 = {0, 0, 0, 1, 2, 5}; //10
        int[] nums5 = {1, 2, 2, 2, 1}; // 8
        int[] nums6 = {1, 2, 10, 0, 0}; //20
        int[] nums7 = {-4, -2, -1, -1}; // 8
        int[] nums8 = {-4, -2, -1}; // 8
        int[] nums9 = {0, 2, 3, 2, -1}; // 12
        int[] nums10 = {1, 1, -1, 2, 2}; // 4
        int[] nums11 = {2, 2, 0, -1, 1, 1}; // 4
        int[] nums12 = {3, -1, 4}; // 4
        int[] nums13 = {-1, -2, -3, 0}; // 6

        System.out.println(maxProduct(nums));
        System.out.println(maxProduct(nums2));
        System.out.println(maxProduct(nums3));
        System.out.println(maxProduct(nums4));
        System.out.println(maxProduct(nums5));
        System.out.println(maxProduct(nums6));
        System.out.println(maxProduct(nums7));
        System.out.println(maxProduct(nums8));
        System.out.println(maxProduct(nums9));
        System.out.println(maxProduct(nums10));
        System.out.println(maxProduct(nums11));
        System.out.println(maxProduct(nums11));
        System.out.println(maxProduct(nums12));
        System.out.println(maxProduct(nums13));
    }

    public static int maxProduct(int[] nums) {
        int max = nums[0];
        int max2 = nums[nums.length - 1];
        if (nums.length == 1) {
            max = nums[0];
            return max;
        }
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = current * nums[i];
            if (current == 0) {
                current = nums[i];
            }
            max = Math.max(max, current);
        }
        int current2 = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            current2 = current2 * nums[i];
            if (current2 == 0) {
                current2 = nums[i];
            }
            max2 = Math.max(max2, current2);
        }
        max = Math.max(max, max2);
        return max;
    }
}
