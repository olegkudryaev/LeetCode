package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckIfTwoStringArraysAreEquivalentTest {

    @Test
    void test(){
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        boolean b = CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2);

        Assertions.assertEquals(true, b);
    }
}
