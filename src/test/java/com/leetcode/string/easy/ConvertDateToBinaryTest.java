package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertDateToBinaryTest {
    @Test
    void test1(){
        String date = "2080-02-29";
        String expect = "100000100000-10-11101";

        String string = ConvertDateToBinary.convertDateToBinary(date);

        Assertions.assertEquals(expect, string);
    }
}
