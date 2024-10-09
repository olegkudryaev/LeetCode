package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PartitionLabelsTest {

    @Test
    void test1() {
        String s = "ababcbacadefegdehijhklij";

        List<Integer> integers = PartitionLabels.partitionLabels(s);


        List<Integer> expect = new ArrayList<>();
        expect.add(9);
        expect.add(7);
        expect.add(8);
        Assertions.assertEquals(expect, integers);
    }
}
