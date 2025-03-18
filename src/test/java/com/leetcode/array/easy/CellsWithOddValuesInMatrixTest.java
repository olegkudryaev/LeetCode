package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CellsWithOddValuesInMatrixTest {
    @Test
    void test(){
        int m = 2, n = 3;

        int[][] nums = {{1,0}, {1,1}};

        int exp = 6;

        int i = CellsWithOddValuesInMatrix.oddCells(m, n, nums);

        Assertions.assertEquals(i, exp);
    }
}
