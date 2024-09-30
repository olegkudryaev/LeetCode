package com.leetcode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScoreOfStringTest {

    @Test
    void test1(){
        String s = "zaz";

        int i = ScoreOfString.scoreOfString(s);

        Assertions.assertEquals(50, i);
    }

    @Test
    void test2(){
        String s = "hello";

        int i = ScoreOfString.scoreOfString(s);

        Assertions.assertEquals(13, i);
    }
}
