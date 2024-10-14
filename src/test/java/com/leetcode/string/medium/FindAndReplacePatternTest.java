package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FindAndReplacePatternTest {

    @Test
    void test1() {
        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        List<String> expect = List.of("mee", "aqq");

        List<String> andReplacePattern = FindAndReplacePattern.findAndReplacePattern(words, pattern);

        Assertions.assertEquals(expect, andReplacePattern);
    }
}
