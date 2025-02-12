package com.leetcode.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumSumOfFourDigitNumberAfterSplittingDigitsTest {
    @Test
    void test(){
        int num = 2932;
        int output = 52;

        int i = MinimumSumOfFourDigitNumberAfterSplittingDigits.minimumSum(num);

        Assertions.assertEquals(output, i);
    }
}
