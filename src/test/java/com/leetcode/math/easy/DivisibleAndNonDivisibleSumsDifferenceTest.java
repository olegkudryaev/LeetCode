package com.leetcode.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibleAndNonDivisibleSumsDifferenceTest {

    @Test
    void test1() {
        int n = 10, m = 3;
        int expect = 19;

        int i = DivisibleAndNonDivisibleSumsDifference.differenceOfSums(n, m);

        Assertions.assertEquals(expect, i);
    }
}
