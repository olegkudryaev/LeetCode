package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FinalValueOfVariableAfterPerformingOperationsTest {

    @Test
    void test1() {
        String[] forTest = new String[]{"--X", "X++", "X++"};

        int i = FinalValueOfVariableAfterPerformingOperations.finalValueAfterOperations(forTest);

        Assertions.assertEquals(1, i);
    }
}
