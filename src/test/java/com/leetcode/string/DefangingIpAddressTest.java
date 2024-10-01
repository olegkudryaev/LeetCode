package com.leetcode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DefangingIpAddressTest {

    @Test
    void test1(){
        String forTest = "1.1.1.1";

        String string = DefangingIpAddress.defangIPaddr(forTest);

        Assertions.assertEquals(forTest, string);

        forTest = "255.100.50.0";

        string = DefangingIpAddress.defangIPaddr(forTest);

        Assertions.assertEquals(forTest, string);
    }
}
