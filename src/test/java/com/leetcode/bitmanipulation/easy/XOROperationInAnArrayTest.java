package com.leetcode.bitmanipulation.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XOROperationInAnArrayTest {
    @Test
    void test(){
        int n = 5, start = 0;
        int exp = 8;

        int i = XOROperationInAnArray.xorOperation(n, start);

        Assertions.assertEquals(exp, i);
    }
}
