package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubrectangleQueriesTest {
    @Test
    void test1(){
        String[] strs = {"SubrectangleQueries","getValue","updateSubrectangle","getValue","getValue","updateSubrectangle","getValue","getValue"};
        int[][] ints = {
                {1, 2, 1},
                {4, 3, 4},
                {3, 2, 1},
                {1, 1, 1}
        };

        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(ints);
        int value = subrectangleQueries.getValue(0, 2);//1
        Assertions.assertEquals(1, value);
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        // После этого обновления прямоугольник выглядит так:
        // 5 5 5
        // 5 5 5
        // 5 5 5
        // 5 5 5
        value = subrectangleQueries.getValue(0, 2);// вернуть 5
        Assertions.assertEquals(5, value);
        value = subrectangleQueries.getValue(3, 1);// вернуть 5
        Assertions.assertEquals(5, value);
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        // После этого обновления прямоугольник выглядит так:
        // 5 5 5
        // 5 5 5
        // 5 5 5
        // 10 10 10
        value = subrectangleQueries.getValue(3, 1);// вернуть 10
        Assertions.assertEquals(10, value);
        value = subrectangleQueries.getValue(0, 2);// вернуть 5
        Assertions.assertEquals(5, value);
    }
}
