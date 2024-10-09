package com.leetcode.string.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecutionOfAllSuffixInstructionsStayingInGrid {

    /**
     * 2120. Execution of All Suffix Instructions Staying in a Grid
     * Medium
     * Topics
     * Companies
     * Hint
     * There is an n x n grid, with the top-left cell at (0, 0) and the bottom-right cell at (n - 1, n - 1). You are given the integer n and an integer array startPos where startPos = [startrow, startcol] indicates that a robot is initially at cell (startrow, startcol).
     * <p>
     * You are also given a 0-indexed string s of length m where s[i] is the ith instruction for the robot: 'L' (move left), 'R' (move right), 'U' (move up), and 'D' (move down).
     * <p>
     * The robot can begin executing from any ith instruction in s. It executes the instructions one by one towards the end of s but it stops if either of these conditions is met:
     * <p>
     * The next instruction will move the robot off the grid.
     * There are no more instructions left to execute.
     * Return an array answer of length m where answer[i] is the number of instructions the robot can execute if the robot begins executing from the ith instruction in s.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: n = 3, startPos = [0,1], s = "RRDDLU"
     * Output: [1,5,4,3,1,0]
     * Explanation: Starting from startPos and beginning execution from the ith instruction:
     * - 0th: "RRDDLU". Only one instruction "R" can be executed before it moves off the grid.
     * - 1st:  "RDDLU". All five instructions can be executed while it stays in the grid and ends at (1, 1).
     * - 2nd:   "DDLU". All four instructions can be executed while it stays in the grid and ends at (1, 0).
     * - 3rd:    "DLU". All three instructions can be executed while it stays in the grid and ends at (0, 0).
     * - 4th:     "LU". Only one instruction "L" can be executed before it moves off the grid.
     * - 5th:      "U". If moving up, it would move off the grid.
     * Example 2:
     * <p>
     * <p>
     * Input: n = 2, startPos = [1,1], s = "LURD"
     * Output: [4,1,0,0]
     * Explanation:
     * - 0th: "LURD".
     * - 1st:  "URD".
     * - 2nd:   "RD".
     * - 3rd:    "D".
     * Example 3:
     * <p>
     * <p>
     * Input: n = 1, startPos = [0,0], s = "LRUD"
     * Output: [0,0,0,0]
     * Explanation: No matter which instruction the robot begins execution from, it would move off the grid.
     */
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        int[] result = new int[s.length()];
        int[][] map = new int[n][n];
        int col = startPos[0];
        int raw = startPos[1];

        for (int i = 0; i < s.length(); i++) {
            int count = getNumberOfMoves(s.substring(i, s.length()), col, raw, n);
            result[i] = count;
        }

        return result;
    }

    private static int getNumberOfMoves(String s, int col, int raw, int n) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                if (raw + 1 < n) {
                    raw++;
                    count++;
                } else {
                    break;
                }
            } else if (s.charAt(i) == 'L') {
                if (raw - 1 >= 0) {
                    raw--;
                    count++;
                } else {
                    break;
                }
            } else if (s.charAt(i) == 'U') {
                if (col - 1 >= 0) {
                    col--;
                    count++;
                } else {
                    break;
                }
            } else if (s.charAt(i) == 'D') {
                if (col + 1 < n) {
                    col++;
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
