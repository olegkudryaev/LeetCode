package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TruncateSentenceTest {

    @Test
    void test1() {
        String s = "Hello how are you Contestant";
        int k = 4;

        String string = TruncateSentence.truncateSentence(s, k);

        Assertions.assertEquals("Hello how are you", string);
    }
}
