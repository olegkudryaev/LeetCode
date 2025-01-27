package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBoxTest {
    @Test
    void test(){
        String boxes = "110";
        int[] exp = {1,1,3};

        int[] ints = MinimumNumberOfOperationsToMoveAllBallsToEachBox.minOperations(boxes);

        for (int i = 0; i < exp.length; i++) {
            Assertions.assertEquals(exp[i], ints[i]);
        }
    }
}
