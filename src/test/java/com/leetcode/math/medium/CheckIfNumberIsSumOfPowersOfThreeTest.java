package com.leetcode.math.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckIfNumberIsSumOfPowersOfThreeTest {
    @Test
    void test(){
        int n = 12;

        boolean exp = true;

        boolean b = CheckIfNumberIsSumOfPowersOfThree.checkPowersOfThree(n);

        Assertions.assertEquals(b, exp);
    }
}
