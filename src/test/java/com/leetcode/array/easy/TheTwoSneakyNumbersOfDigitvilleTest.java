package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TheTwoSneakyNumbersOfDigitvilleTest {

    @Test
    void test1(){
        int[] nums = {0,1,1,0};
        int[] expect = {0,1};

        int[] sneakyNumbers = TheTwoSneakyNumbersOfDigitville.getSneakyNumbers(nums);

        for (int i = 0; i < sneakyNumbers.length; i++) {
            Assertions.assertEquals(expect[i], sneakyNumbers[i]);
        }
    }
}
