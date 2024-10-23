package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeightCheckerTest {

    @Test
    void test1() {
        int[] heights = {1, 1, 4, 2, 1, 3};
        int expect = 3;

        int i = HeightChecker.heightChecker(heights);

        Assertions.assertEquals(expect, i);
    }

    @Test
    void test2() {
        int[] heights = {5,1,2,3,4};
        int expect = 5;

        int i = HeightChecker.heightChecker(heights);

        Assertions.assertEquals(expect, i);
    }
}
