package com.leetcode.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class NumberOfOneBitsTest {

    @InjectMocks
    private NumberOfOneBits numberOfOneBits;

    @Test
    void test1() {
        int num = 16;

        int i = NumberOfOneBits.hammingWeight(num);

        Assertions.assertEquals(num, i);
    }
}
