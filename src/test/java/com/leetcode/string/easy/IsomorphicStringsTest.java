package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsomorphicStringsTest {

    @Test
    void test1(){
        String s = "badc", t = "baba";

        boolean isomorphic = IsomorphicStrings.isIsomorphic(s, t);

        Assertions.assertEquals(true, isomorphic);
    }
}
