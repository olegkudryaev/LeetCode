package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountTheNumberOfConsistentStringsTest {

    @Test
    void test1() {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        int expect = 2;

        int i = CountTheNumberOfConsistentStrings.countConsistentStrings(allowed, words);

        Assertions.assertEquals(expect, i);
    }
}
