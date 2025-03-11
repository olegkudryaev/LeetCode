package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortVowelsInStringTest {

    @Test
    void test(){
        String s = "lEetcOde";

        String exp = "lEOtcede";

        String s1 = SortVowelsInString.sortVowels(s);

        Assertions.assertEquals(exp, s1);
    }

}
