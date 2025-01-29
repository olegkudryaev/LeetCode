package com.leetcode.graph.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindCenterOfStarGraphTest {
    @Test
    void test(){
        int[][] edges = {{1,2},{2,3},{4,2},};
        int esp = 2;

        int center = FindCenterOfStarGraph.findCenter(edges);

        Assertions.assertEquals(esp, center);
    }
}
