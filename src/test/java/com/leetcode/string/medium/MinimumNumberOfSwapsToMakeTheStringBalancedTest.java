package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumNumberOfSwapsToMakeTheStringBalancedTest {
    @Test
    void test1() {
        String s = "][][";

        int i = MinimumNumberOfSwapsToMakeTheStringBalanced.minSwaps(s);

        Assertions.assertEquals(1, i);
    }
    @Test
    void test2() {
        String s = "]]][[[";

        int i = MinimumNumberOfSwapsToMakeTheStringBalanced.minSwaps(s);

        Assertions.assertEquals(2, i);
    }
    @Test
    void test3() {
        String s = "[]";

        int i = MinimumNumberOfSwapsToMakeTheStringBalanced.minSwaps(s);

        Assertions.assertEquals(0, i);
    }
    @Test
    void test4() {
        String s = "][[]][][[][]";

        int i = MinimumNumberOfSwapsToMakeTheStringBalanced.minSwaps(s);

        Assertions.assertEquals(1, i);
    }
    @Test
    void test5() {
        String s = "][]][[]]][[[";

        int i = MinimumNumberOfSwapsToMakeTheStringBalanced.minSwaps(s);

        Assertions.assertEquals(2, i);
    }
}
