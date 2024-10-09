package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExecutionOfAllSuffixInstructionsStayingInGridTest {

    @Test
    void test1(){
        int n = 3;
        int[] startPos = {0,1};
//        String s = "RLRL";
        String s = "RRDDLU";

        int[] ints = ExecutionOfAllSuffixInstructionsStayingInGrid.executeInstructions(n, startPos, s);

        int[] expect = {1,5,4,3,1,0};
        //Assertions.assertEquals(expect.toString(), ints.toString());
    }
}
