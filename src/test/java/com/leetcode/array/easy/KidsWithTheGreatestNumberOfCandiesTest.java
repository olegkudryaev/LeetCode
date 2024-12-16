package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandiesTest {
    @Test
    void test() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expect = new ArrayList<>();
        expect.add(true);
        expect.add(true);
        expect.add(true);
        expect.add(false);
        expect.add(true);

        List<Boolean> booleans = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);

        for (int i = 0; i < expect.size(); i++) {
            Assertions.assertEquals(expect.get(i), booleans.get(i));
        }
    }
}
