package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumNumberOfMovesToSeatEveryoneTest {
    @Test
    void test() {
        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        int expected = 4;

        int i = MinimumNumberOfMovesToSeatEveryone.minMovesToSeat(seats, students);
        Assertions.assertEquals(expected, i);
    }
}
