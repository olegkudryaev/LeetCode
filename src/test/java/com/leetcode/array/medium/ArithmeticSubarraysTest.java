package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticSubarraysTest {
    @Test
    void test() {
        int[] nums = {-3,-6,-8,-4,-2,-8,-6,0,0,0,0};
        int[] l = {2,4};
        int[] r = {3,7};

        List<Boolean> exp = new ArrayList<>();
        exp.add(true);
        exp.add(false);
        exp.add(true);

        List<Boolean> booleans = ArithmeticSubarrays.checkArithmeticSubarrays(nums, l, r);

        for (int i = 0; i < booleans.size(); i++) {
            Assertions.assertEquals(booleans.get(i), exp.get(i));

        }
    }
}
