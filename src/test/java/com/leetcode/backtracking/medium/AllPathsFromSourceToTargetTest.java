package com.leetcode.backtracking.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathsFromSourceToTargetTest {

    @Test
    void test() {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        List<List<Integer>> exp = new ArrayList<>() {{
            add(Arrays.asList(0, 1, 3));
            add(Arrays.asList(0, 2, 3));
        }};

        List<List<Integer>> lists = AllPathsFromSourceToTarget.allPathsSourceTarget(graph);

        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                Assertions.assertEquals(exp.get(i).get(j), lists.get(i).get(j));
            }
        }
    }
}
