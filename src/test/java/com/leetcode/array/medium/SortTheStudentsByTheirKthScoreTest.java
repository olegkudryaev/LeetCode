package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTheStudentsByTheirKthScoreTest {
    @Test
    void test() {
        int[][] nums = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
        int k = 2;
        int[][] exp = {{7, 5, 11, 2}, {10, 6, 9, 1}, {4, 8, 3, 15}};
        int[][] ints = SortTheStudentsByTheirKthScore.sortTheStudents(nums, k);

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                Assertions.assertEquals(exp[i][j], ints[i][j]);
            }
        }
    }
}
