package com.leetcode.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallestEvenMultipleTest {
    @Test
    void test1(){
        int n = 5;
        int expected = 10;

        int i = SmallestEvenMultiple.smallestEvenMultiple(n);

        Assertions.assertEquals(expected, i);
    }
}
