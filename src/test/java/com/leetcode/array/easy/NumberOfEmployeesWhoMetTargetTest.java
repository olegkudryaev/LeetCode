package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfEmployeesWhoMetTargetTest {
    @Test
    void test1() {
        int[] hours = {0,1,2,3,4};
        int target = 2;

        int expected = 3;

        int i = NumberOfEmployeesWhoMetTarget.numberOfEmployeesWhoMetTarget(hours, target);
        Assertions.assertEquals(expected, i);

    }
}
