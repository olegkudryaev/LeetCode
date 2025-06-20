package com.leetcode.array.medium;

public class SortStudentsByTheirKthScore {
    /**
     * 2545. Sort the Students by Their Kth Score
     * Medium
     * Topics
     * premium lock icon
     * Companies
     * Hint
     * There is a class with m students and n exams. You are given a 0-indexed m x n integer matrix score, where each row represents one student and score[i][j] denotes the score the ith student got in the jth exam. The matrix score contains distinct integers only.
     * <p>
     * You are also given an integer k. Sort the students (i.e., the rows of the matrix) by their scores in the kth (0-indexed) exam from the highest to the lowest.
     * <p>
     * Return the matrix after sorting it.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: score = [[10,6,9,1],[7,5,11,2],[4,8,3,15]], k = 2
     * Output: [[7,5,11,2],[10,6,9,1],[4,8,3,15]]
     * Explanation: In the above diagram, S denotes the student, while E denotes the exam.
     * - The student with index 1 scored 11 in exam 2, which is the highest score, so they got first place.
     * - The student with index 0 scored 9 in exam 2, which is the second highest score, so they got second place.
     * - The student with index 2 scored 3 in exam 2, which is the lowest score, so they got third place.
     * Example 2:
     * <p>
     * <p>
     * Input: score = [[3,4],[5,6]], k = 0
     * Output: [[5,6],[3,4]]
     * Explanation: In the above diagram, S denotes the student, while E denotes the exam.
     * - The student with index 1 scored 5 in exam 0, which is the highest score, so they got first place.
     * - The student with index 0 scored 3 in exam 0, which is the lowest score, so they got second place.
     */
    public static int[][] sortTheStudents(int[][] score, int k) {
        for (int i = 0; i < score.length; i++) {
            int index = i;
            for (int j = i + 1; j < score.length; j++) {
                if (score[index][k] < score[j][k]) {
                    index = j;
                }
            }
            swapArray(score, index, i);
        }
        return score;
    }

    private static void swapArray(int[][] arr, int from, int to) {
        int[] temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

}
