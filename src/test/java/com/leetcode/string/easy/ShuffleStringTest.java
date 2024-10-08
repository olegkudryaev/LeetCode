package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShuffleStringTest {

    @Test
    void test1() {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        String string = ShuffleString.restoreString(s, indices);

        Assertions.assertEquals("leetcode", string);
    }

}
