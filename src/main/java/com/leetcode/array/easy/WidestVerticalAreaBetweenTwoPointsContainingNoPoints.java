package com.leetcode.array.easy;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    /**
     * 1637. Widest Vertical Area Between Two Points Containing No Points
     * Easy
     * Topics
     * Companies
     * Hint
     * Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that no points are inside the area.
     * <p>
     * A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.
     * <p>
     * Note that points on the edge of a vertical area are not considered included in the area.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * ​
     * Input: points = [[8,7],[9,9],[7,4],[9,7]]
     * Output: 1
     * Explanation: Both the red and the blue area are optimal.
     * Example 2:
     * <p>
     * Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
     * Output: 3
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == points.length
     * 2 <= n <= 105
     * points[i].length == 2
     */
    public static int maxWidthOfVerticalArea(int[][] points) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                integerList.add(points[i][j]);
                break;
            }
        }
        Collections.sort(integerList);
        int result = 0;
        for (int i = 1; i < integerList.size(); i++) {
            int temp = 0;
            if (integerList.get(i) > integerList.get(i - 1)) {
                temp = integerList.get(i) - integerList.get(i - 1);
            }
            if(temp > result) {
                result = temp;
            }
        }
        return result;
    }
}
