package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ConvertAnArrayInto2DArrayWithConditionsTest {
    @Test
    void test() {
        int[] input = {1, 3, 4, 1, 2, 3, 1};
        int[][] output = {{1, 2, 3, 4}, {1, 3}, {1}};

        List<List<Integer>> matrix = ConvertAnArrayInto2DArrayWithConditions.findMatrix(input);

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                Assertions.assertEquals(output[i][j], matrix.get(i).get(j));
            }
        }
    }
}
