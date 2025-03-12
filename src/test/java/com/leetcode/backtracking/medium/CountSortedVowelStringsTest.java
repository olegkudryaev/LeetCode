package com.leetcode.backtracking.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountSortedVowelStringsTest {

    @Test
    void test(){
        int n = 2;

        int exp = 15;

        int i = CountSortedVowelStrings.countVowelStrings(n);

        Assertions.assertEquals(exp, i);
    }
}
