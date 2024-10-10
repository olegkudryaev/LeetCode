package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveAllOccurrencesOfSubstringTest {

    @Test
    void test1() {
//        String s = "daabcbaabcbc";
//        String part = "abc";
        String s = "aabababa";
        String part = "aba";

        String string = RemoveAllOccurrencesOfSubstring.removeOccurrences(s, part);

        Assertions.assertEquals("ba", string);
    }
}
