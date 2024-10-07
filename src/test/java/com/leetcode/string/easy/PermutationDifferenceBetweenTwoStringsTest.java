package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationDifferenceBetweenTwoStringsTest {

    @Test
    void test1() {
        String s = "abc", t = "bac";
        int permutationDifference = PermutationDifferenceBetweenTwoStrings.findPermutationDifference(s, t);
        Assertions.assertEquals(2, permutationDifference);
        Assertions.assertEquals(2, permutationDifference);

        s = "abcde";
        t = "edbac";
        int permutationDifference2 = PermutationDifferenceBetweenTwoStrings.findPermutationDifference(s, t);
        Assertions.assertEquals(12, permutationDifference2);
    }
}
