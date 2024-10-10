package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecryptStringFromAlphabetToIntegerMappingTest {

    @Test
    void test1() {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";

        String string = DecryptStringFromAlphabetToIntegerMapping.freqAlphabets(s);

        Assertions.assertEquals("abcdefghijklmnopqrstuvwxyz", string);
    }

}
