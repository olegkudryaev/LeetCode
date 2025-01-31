package com.leetcode.math.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrictlyPalindromicNumberTest {
    @Test
    void test(){
        int  n = 9;
        boolean exp = false;

        boolean strictlyPalindromic = StrictlyPalindromicNumber.isStrictlyPalindromic(n);

        Assertions.assertEquals(exp, strictlyPalindromic);
    }
}
