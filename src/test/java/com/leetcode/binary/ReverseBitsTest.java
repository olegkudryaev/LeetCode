package com.leetcode.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class ReverseBitsTest {

    @InjectMocks
    private ReverseBits reverseBits;

    @Test
    void test1() {
        int n = 43261596;

        int i = ReverseBits.reverseBits(n);

        Assertions.assertEquals(964176192, i);
    }
}
