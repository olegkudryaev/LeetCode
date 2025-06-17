package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortStudentsByTheirKthScoreTest {
    @Test
    void test() {
        int[][] score = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
//        int[][] score = {{3,4},{5,6}};
        int k = 2;
        int[][] output = {{7, 5, 11, 2}, {10, 6, 9, 1}, {4, 8, 3, 15}};

        int[][] ints = SortStudentsByTheirKthScore.sortTheStudents(score, k);

        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints[i].length - 1; j++) {
                Assertions.assertEquals(ints[i][j], output[i][j]);
            }
        }
    }
}
