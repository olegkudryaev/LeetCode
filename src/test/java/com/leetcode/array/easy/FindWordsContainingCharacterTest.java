package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FindWordsContainingCharacterTest {

    @Test
    void test1() {
        String[] words = {"leet", "code"};
        char x = 'e';

        List<Integer> expect = List.of(0, 1);

        List<Integer> wordsContaining = FindWordsContainingCharacter.findWordsContaining(words, x);

        Assertions.assertEquals(expect, wordsContaining);
    }
}
