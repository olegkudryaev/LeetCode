package com.leetcode.array.easy;

public class LargestLocalValuesInMatrix {

    /**
     * 2373. Largest Local Values in a Matrix
     * Easy
     * Topics
     * Companies
     * Hint
     * You are given an n x n integer matrix grid.
     * <p>
     * Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:
     * <p>
     * maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
     * In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.
     * <p>
     * Return the generated matrix.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
     * Output: [[9,9],[8,6]]
     * Explanation: The diagram above shows the original matrix and the generated matrix.
     * Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.
     * Example 2:
     * <p>
     * <p>
     * Input: grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
     * Output: [[2,2,2],[2,2,2],[2,2,2]]
     * Explanation: Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == grid.length == grid[i].length
     * 3 <= n <= 100
     * 1 <= grid[i][j] <= 100
     */

    public static int[][] largestLocal(int[][] grid) {
        int resultLength = grid.length - 2;
        int[][] result = new int[resultLength][resultLength];

        for (int i = 0; i < resultLength; i++) { //+1 - вниз на одну строку
            for (int j = 0; j < resultLength; j++) {// +1 вправо на одну клетку
                result[i][j] = getMax(grid, i, j);
            }
        }
        return result;
    }

    private static int getMax(int[][] grid, int i, int j) {
        int max = 0;
        for (int k = i; k < i+3; k++) {
            for (int l = j; l < j+3; l++) {
                int num = grid[k][l];
                max = Math.max(num, max);
            }
        }
        return max;
    }
}
