package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfSquaresOfSpecialElementsTest {

    @Test
    void test1(){
        int[] nums = {1,2,3,4};

        int expect = 21;

        int i = SumOfSquaresOfSpecialElements.sumOfSquares(nums);

        Assertions.assertEquals(expect, i);
    }

    @Test
    void test2(){
        int[] nums = {2,7,1,19,18,3};

        int expect = 63;

        int i = SumOfSquaresOfSpecialElements.sumOfSquares(nums);

        Assertions.assertEquals(expect, i);
    }
}
