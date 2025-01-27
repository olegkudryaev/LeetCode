package com.leetcode.bitmanipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecodeXORedArrayTest {
    @Test
    void test() {
        int[] encoded = {1, 2, 3};
        int first = 1;

        int[]exp ={1,0,2,1};
        int[] decode = DecodeXORedArray.decode(encoded, first);
        for (int i = 0; i < decode.length; i++) {
            Assertions.assertEquals(exp[i], decode[i]);
        }
    }
}
