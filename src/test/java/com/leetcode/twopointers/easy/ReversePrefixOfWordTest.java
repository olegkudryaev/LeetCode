package com.leetcode.twopointers.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePrefixOfWordTest {
    @Test
    void test() {
        String word = "abcdefd";
        char ch = 'd';

        String exp = "dcbaefd";

        String s = ReversePrefixOfWord.reversePrefix(word, ch);

        Assertions.assertEquals(exp, s);
    }
}
