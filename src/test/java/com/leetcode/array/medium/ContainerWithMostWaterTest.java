package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class ContainerWithMostWaterTest {

    @InjectMocks
    private ContainerWithMostWater containerWithMostWater;

    @Test
    void test1 (){
        int[] numb = {1,8,6,2,5,4,8,3,7};
        int i = ContainerWithMostWater.maxArea(numb);
        Assertions.assertEquals(49,i);
    }
}
