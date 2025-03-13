package com.leetcode.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DetermineColorOfChessboardSquareTest {

    @Test
    void test() {
        String coordinates = "a1";
        boolean exp = false;

        boolean b = DetermineColorOfChessboardSquare.squareIsWhite(coordinates);

        Assertions.assertEquals(exp, b);
    }
}
