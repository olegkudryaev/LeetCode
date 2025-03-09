package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumNumberOfCoinsYouCanGetTest {

    @Test
    void test() {
        int[] nums = {2,4,1,2,7,8};

        int exp = 9;

        int i = MaximumNumberOfCoinsYouCanGet.maxCoins(nums);

        Assertions.assertEquals(exp, i);
    }
}
