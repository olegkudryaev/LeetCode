package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPointsTest {
    @Test
    public void test() {
        int[][] points = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        int expected = 1;

        int i = WidestVerticalAreaBetweenTwoPointsContainingNoPoints.maxWidthOfVerticalArea(points);
        Assertions.assertEquals(expected, i);
    }
}
