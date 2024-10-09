package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMaximumNumberOfStringPairsTest {

    @Test
    void test1() {
        String[] stringArray = {"cd", "ac", "dc", "ca", "zz"};
//        String[] stringArray = {"aa","ab"};

        int i = FindMaximumNumberOfStringPairs.maximumNumberOfStringPairs(stringArray);

        Assertions.assertEquals(2, i);
    }
}
