package com.leetcode.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountTheDigitsThatDivideNumberTest {
    @Test
    void test(){
        int num = 1248;
        int exp = 4;
        int i = CountTheDigitsThatDivideNumber.countDigits(num);
        Assertions.assertEquals(exp, i);
    }
}
