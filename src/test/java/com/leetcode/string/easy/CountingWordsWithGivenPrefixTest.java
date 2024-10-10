package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountingWordsWithGivenPrefixTest {

    @Test
    void test1(){
//        String[] strings = {"pay","attention","practice","attend"};
//        String pref = "at";
//        String[] strings = {"leetcode","win","loops","success"};
//        String pref = "code";
        String[] strings = {"sxyjellhlh","sxyjellhlh","sxyjellhlh"};
        String pref = "sxyjellhlh";


        int i = CountingWordsWithGivenPrefix.prefixCount(strings, pref);

        Assertions.assertEquals(2, i);
    }
}
