package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HowManyNumbersAreSmallerThanCurrentNumberTest {
    @Test
    void test(){
        int[] nums = {8,1,2,2,3};
        int[] exp = {4,0,1,1,3};

        int[] ints = HowManyNumbersAreSmallerThanCurrentNumber.smallerNumbersThanCurrent(nums);
        for (int i = 0; i < nums.length; i++) {
            Assertions.assertEquals(exp[i], ints[i]);
        }

    }
}
