package com.leetcode.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class SumOfTwoIntegersTest {

    @InjectMocks
    private SumOfTwoIntegers sumOfTwoIntegers;

    @Test
    void test1(){
        int expected = SumOfTwoIntegers.getSum(4, 4);

        Assertions.assertEquals(8, expected);
    }
}
