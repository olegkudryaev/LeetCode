package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindIndicesOfStableMountainsTest {
    @Test
    void test() {
        int[] height = {1, 2, 3, 4, 5};
        int[] height2 = {3,4};
        int threshold = 2;

        List<Integer> integers = FindIndicesOfStableMountains.stableMountains(height, threshold);
        List<Integer> exp = Arrays.stream(height2)
                .boxed()
                .toList();
        for (int i = 0; i < height2.length; i++) {
            Assertions.assertEquals(exp.get(i), integers.get(i));

        }
    }
}
