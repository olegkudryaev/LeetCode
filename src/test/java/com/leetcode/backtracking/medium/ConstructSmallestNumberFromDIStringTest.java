package com.leetcode.backtracking.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructSmallestNumberFromDIStringTest {
    @Test
    void test(){
        String pattern = "IIIDIDDD";
        String exp = "123549876";

        String s = ConstructSmallestNumberFromDIString.smallestNumber(pattern);

        Assertions.assertEquals(exp, s);
    }
}
