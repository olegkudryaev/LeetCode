package com.leetcode.array.medium;

import java.util.Arrays;

public class QueriesOnNumberOfPointsInsideCircle {
    /**
     * 1828. Queries on Number of Points Inside a Circle
     * Medium
     * Topics
     * Companies
     * Hint
     * You are given an array points where points[i] = [xi, yi] is the coordinates of the ith point on a 2D plane. Multiple points can have the same coordinates.
     * <p>
     * You are also given an array queries where queries[j] = [xj, yj, rj] describes a circle centered at (xj, yj) with a radius of rj.
     * <p>
     * For each query queries[j], compute the number of points inside the jth circle. Points on the border of the circle are considered inside.
     * <p>
     * Return an array answer, where answer[j] is the answer to the jth query.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: points = [[1,3],[3,3],[5,3],[2,2]], queries = [[2,3,1],[4,3,1],[1,1,2]]
     * Output: [3,2,2]
     * Explanation: The points and circles are shown above.
     * queries[0] is the green circle, queries[1] is the red circle, and queries[2] is the blue circle.
     * Example 2:
     * <p>
     * <p>
     * Input: points = [[1,1],[2,2],[3,3],[4,4],[5,5]], queries = [[1,2,2],[2,2,2],[4,3,2],[4,3,3]]
     * Output: [2,3,2,4]
     * Explanation: The points and circles are shown above.
     * queries[0] is green, queries[1] is red, queries[2] is blue, and queries[3] is purple.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= points.length <= 500
     * points[i].length == 2
     * 0 <= x​​​​​​i, y​​​​​​i <= 500
     * 1 <= queries.length <= 500
     * queries[j].length == 3
     * 0 <= xj, yj <= 500
     * 1 <= rj <= 500
     * All coordinates are integers.
     * <p>
     * <p>
     * Follow up: Could you find the answer for each query in better complexity than O(n)?
     */
    public static int[] countPoints(int[][] points, int[][] queries) {
        //√((x₂ - x₁)² + (y₂ - y₁)²)
        //• (x₁, y₁) — координаты первой точки
        // (x₂, y₂) — координаты второй точки (центра круга).

        int count = 0;
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < points.length; j++) {
                int i1 = queries[i][2];
                int i2 = queries[i][0] - points[j][0];
                int i3 = queries[i][1] - points[j][1];
                double sqrt = (i2 * i2) + (i3 * i3);
                if ((i1 * i1) >= sqrt) {
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }
        return result;
    }
}
