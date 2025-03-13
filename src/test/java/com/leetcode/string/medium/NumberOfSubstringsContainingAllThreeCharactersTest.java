package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSubstringsContainingAllThreeCharactersTest {
    @Test
    void test(){
        String s = "abcabc";
        int num = 10;

        int i = NumberOfSubstringsContainingAllThreeCharacters.numberOfSubstrings(s);

        Assertions.assertEquals(num, i);
    }
}
