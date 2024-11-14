package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {
    @Test
    void test1(){
        String n = "32";
        int expect = 3;

        int i = PartitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n);

        Assertions.assertEquals(expect, i);
    }
}
