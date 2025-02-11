package com.leetcode.bitmanipulation.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindThePrefixCommonArrayOfTwoArraysTest {
    @Test
    void test() {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};
        int[] exp = {0, 2, 3, 4};

        int[] thePrefixCommonArray = FindThePrefixCommonArrayOfTwoArrays.findThePrefixCommonArray(A, B);

        for (int i = 0; i < exp.length; i++) {
            Assertions.assertEquals(exp[i], thePrefixCommonArray[i]);
        }
    }

}
