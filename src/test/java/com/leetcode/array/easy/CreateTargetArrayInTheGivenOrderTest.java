package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateTargetArrayInTheGivenOrderTest {

    @Test
    void test() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] output = {0, 4, 1, 3, 2};

        int[] targetArray = CreateTargetArrayInTheGivenOrder.createTargetArray(nums, index);

        for (int i = 0; i < targetArray.length; i++) {
            Assertions.assertEquals(output[i], targetArray[i]);
        }
    }
}
