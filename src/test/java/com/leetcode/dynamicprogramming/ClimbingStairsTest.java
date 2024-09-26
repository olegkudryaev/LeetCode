package com.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

    @Test
    void test1() {
        int n = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;

        Assertions.assertEquals(1, ClimbingStairs.climbStairs(n));
        Assertions.assertEquals(2, ClimbingStairs.climbStairs(n2));
        Assertions.assertEquals(3, ClimbingStairs.climbStairs(n3));
        Assertions.assertEquals(5, ClimbingStairs.climbStairs(n4));
        Assertions.assertEquals(8, ClimbingStairs.climbStairs(n5));
    }
}
