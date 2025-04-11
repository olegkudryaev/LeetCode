package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecompressRunLengthEncodedListTest {
    @Test
    void test() {
        int[] nums = {1, 2, 3, 4};
        int[] exp = {2, 4, 4, 4};

        int[] ints = DecompressRunLengthEncodedList.decompressRLElist(nums);

        Assertions.assertEquals(exp, ints);
    }
}
