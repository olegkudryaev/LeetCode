package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConcatenationOfArrayTest {

    @Test
    void test1() {
        int[] numbers = {1, 2, 1};
        int[] expect = {1,2,1,1,2,1};

        int[] concatenation = ConcatenationOfArray.getConcatenation(numbers);

        for (int i = 0; i < concatenation.length; i++) {
            Assertions.assertEquals(expect[i], concatenation[i]);
        }
    }
}
