package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheKeyOfTheNumbersTest {

    @Test
    void test1(){
        int num1 = 1, num2 = 10, num3 = 1000;
        int expected = 0;

        int i = FindTheKeyOfTheNumbers.generateKey(num1, num2, num3);

        Assertions.assertEquals(expected, i);
    }
}
