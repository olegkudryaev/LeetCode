package com.leetcode.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertTheTemperatureTest {

    @Test
    void test1(){
        Double celsius = 36.50;

        double[] doubles = ConvertTheTemperature.convertTemperature(celsius);

        double[] expect = {309.65000, 97.70000};

        for (int i = 0; i < expect.length; i++) {
            Assertions.assertEquals(expect[i], doubles[i]);
        }
    }
}
