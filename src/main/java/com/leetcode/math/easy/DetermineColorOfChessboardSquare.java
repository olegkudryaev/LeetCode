package com.leetcode.math.easy;

public class DetermineColorOfChessboardSquare {
    /**
     * 1812. Determine Color of a Chessboard Square
     * Easy
     * Topics
     * Companies
     * Hint
     * You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.
     * <p>
     * <p>
     * <p>
     * Return true if the square is white, and false if the square is black.
     * <p>
     * The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: coordinates = "a1"
     * Output: false
     * Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
     * Example 2:
     * <p>
     * Input: coordinates = "h3"
     * Output: true
     * Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
     * Example 3:
     * <p>
     * Input: coordinates = "c7"
     * Output: false
     * <p>
     * <p>
     * Constraints:
     * <p>
     * coordinates.length == 2
     * 'a' <= coordinates[0] <= 'h'
     * '1' <= coordinates[1] <= '8'
     */
    public static boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0);
        int y = coordinates.charAt(1);
        if (x % 2 == 0) {
            return y % 2 != 0;
        } else {
            return y % 2 == 0;
        }
    }
}
