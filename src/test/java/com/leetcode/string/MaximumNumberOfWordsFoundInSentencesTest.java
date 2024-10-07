package com.leetcode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumNumberOfWordsFoundInSentencesTest {

    @Test
    void test1() {
        String[] forTest = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int i = MaximumNumberOfWordsFoundInSentences.mostWordsFound(forTest);

        Assertions.assertEquals(6, i);
    }
}
