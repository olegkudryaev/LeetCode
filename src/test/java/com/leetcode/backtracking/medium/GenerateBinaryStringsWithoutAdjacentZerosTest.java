package com.leetcode.backtracking.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

class GenerateBinaryStringsWithoutAdjacentZerosTest {
    @Test
    void test() {
        int n = 3;
        List<String> exp = List.of(new String[]{"010", "011", "101", "110", "111"});
        List<String> strings = GenerateBinaryStringsWithoutAdjacentZeros.validStrings(n);


    }
}
