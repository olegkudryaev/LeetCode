package com.leetcode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JewelsAndStonesTest {

    @Test
    void test1() {
        String jewels = "aA", stones = "aAAbbbb";
        int i = JewelsAndStones.numJewelsInStones(jewels, stones);
        Assertions.assertEquals(3, i);

    }
}
