package com.leetcode.array.medium;

public class ContainerWithMostWater {

    /**
     * 11. Container With Most Water
     * Medium
     * Topics
     * Companies
     * Hint
     * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
     * <p>
     * Find two lines that together with the x-axis form a container, such that the container contains the most water.
     * <p>
     * Return the maximum amount of water a container can store.
     * <p>
     * Notice that you may not slant the container.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
     * Example 2:
     * <p>
     * Input: height = [1,1]
     * Output: 1
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == height.length
     * 2 <= n <= 105
     * 0 <= height[i] <= 104
     */

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int volume = 0;
        int containerLength = 0;
        int result = 0;
        //[1,8,6,2,5,4,8,3,7]
        while (left < right) {
            if (height[left] <= height[right]) {
                containerLength = right - left;
                volume = height[left] * containerLength;
                left++;
                while (height[left] < height[left - 1]) {
                    left++;
                }
            } else if (height[left] > height[right]) {
                containerLength = right - left;
                volume = height[right] * containerLength;
                right--;
                while (height[right] < height[right + 1]) {
                    right--;
                }
            }
            if (volume > result){
                result = volume;
            }
        }

        return result;
    }
}
