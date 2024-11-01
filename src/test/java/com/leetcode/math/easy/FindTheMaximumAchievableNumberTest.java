package com.leetcode.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheMaximumAchievableNumberTest {

    @Test
    void test1(){
        int num = 4, t = 1;

        int expect = 6;

        int i = FindTheMaximumAchievableNumber.theMaximumAchievableX(num, t);

        Assertions.assertEquals(expect, i);

    }
}
