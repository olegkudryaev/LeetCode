package com.leetcode.array.medium;

public class MaxIncreaseToKeepCitySkyline {
    /**
     * 807. Max Increase to Keep City Skyline
     * Medium
     * Topics
     * Companies
     * There is a city composed of n x n blocks, where each block contains a single building shaped like a vertical square prism. You are given a 0-indexed n x n integer matrix grid where grid[r][c] represents the height of the building located in the block at row r and column c.
     * <p>
     * A city's skyline is the outer contour formed by all the building when viewing the side of the city from a distance. The skyline from each cardinal direction north, east, south, and west may be different.
     * <p>
     * We are allowed to increase the height of any number of buildings by any amount (the amount can be different per building). The height of a 0-height building can also be increased. However, increasing the height of a building should not affect the city's skyline from any cardinal direction.
     * <p>
     * Return the maximum total sum that the height of the buildings can be increased by without changing the city's skyline from any cardinal direction.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
     * Output: 35
     * Explanation: The building heights are shown in the center of the above image.
     * The skylines when viewed from each cardinal direction are drawn in red.
     * The grid after increasing the height of buildings without affecting skylines is:
     * gridNew = [ [8, 4, 8, 7],
     * [7, 4, 7, 7],
     * [9, 4, 8, 7],
     * [3, 3, 3, 3] ]
     * Example 2:
     * <p>
     * Input: grid = [[0,0,0],[0,0,0],[0,0,0]]
     * Output: 0
     * Explanation: Increasing the height of any building will result in the skyline changing.
     */
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
//        int result = 0;
//        for (int i = 0; i < grid.length; i++) {
//            int a = 0;
//            int b = 0;
//            int count = 0;
//            for (int k = 0; k < grid[i].length; k++) {
//                for (int j = 0; j < grid[i].length; j++) {
//                    if (a < grid[i][j]) {
//                        a = grid[i][j];
//                    }
//                }
//                for (int l = 0; l < grid.length; l++) {
//                    if (b < grid[l][count]) {
//                        b = grid[l][count];
//                    }
//                }
//                count++;
//                result += a < b ? a - grid[i][k] : b - grid[i][k];
//                a = 0; //макс строки
//                b = 0;
//            }
//        }
//        return result;
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }
        }
        return ans;
    }
}
