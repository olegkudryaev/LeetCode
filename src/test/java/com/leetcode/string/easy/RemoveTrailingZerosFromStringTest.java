package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveTrailingZerosFromStringTest {
    @Test
    void test(){
        String num = "51230100";
        String resultExp = "512301";

        String s = RemoveTrailingZerosFromString.removeTrailingZeros(num);

        Assertions.assertEquals(s, resultExp);
    }
}
