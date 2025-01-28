package com.leetcode.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {
    @Test
    void test() {
        int n = 234;
        int exp = 15;

        int i = SubtractTheProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(n);
        Assertions.assertEquals(exp, i);
    }
}
