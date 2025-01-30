package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SplitStringInBalancedStringsTest {
    @Test
    void test() {
        String s = "RLRRRLLRLL";
        int exp = 2;
        int i = SplitStringInBalancedStrings.balancedStringSplit(s);

        Assertions.assertEquals(exp, i);
    }
}
