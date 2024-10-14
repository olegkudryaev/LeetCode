package com.leetcode.array.medium;

public class ProductOfArrayExceptSelf {

    /**
     * 238. Product of Array Except Self
     * Medium
     * Topics
     * Companies
     * Hint
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     * <p>
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * <p>
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     * Example 2:
     * <p>
     * Input: nums = [-1,1,0,-3,3]
     * Output: [0,0,9,0,0]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= nums.length <= 105
     * -30 <= nums[i] <= 30
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * <p>
     * <p>
     * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
     * <p>
     * Think how you can efficiently utilize prefix and suffix products to calculate the product of all elements except self for each index.
     * Can you pre-compute the prefix and suffix products in linear time to avoid redundant calculations?
     * Can you minimize additional space usage by reusing memory or modifying the input array to store intermediate results?
     */

    public static void main(String[] args) {
        int[] nums3 = {2, 1, 2, 2}; // 4, 8, 4, 4 / 4, 4, 2 , 1
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] ints = productExceptSelf2(nums3);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }


    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numberForResult = 1;
            int startPoint = i + 1;
            while (startPoint < nums.length) {
                numberForResult = numberForResult * nums[startPoint];
                startPoint++;
            }
            startPoint = i - 1;
            while (startPoint >= 0) {
                numberForResult = numberForResult * nums[startPoint];
                startPoint--;
            }
            result[i] = numberForResult;
            count++;
            System.out.println(count);
        }
        return result;
    }

    public static int[] productExceptSelf2(int[] nums) {
        int count = 0;
        // Array to store all left multiplication
        int[] left = new int[nums.length];

        // Array to store all right multiplication
        int[] right = new int[nums.length];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}
