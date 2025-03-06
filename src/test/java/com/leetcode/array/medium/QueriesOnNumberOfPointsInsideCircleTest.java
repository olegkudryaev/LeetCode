package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueriesOnNumberOfPointsInsideCircleTest {
    @Test
    void test() {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};

        int[] exp = {3, 2, 2};

        int[] ints = QueriesOnNumberOfPointsInsideCircle.countPoints(points, queries);

        for (int i = 0; i < exp.length; i++) {
            Assertions.assertEquals(exp[i], ints[i]);
        }
    }


}
