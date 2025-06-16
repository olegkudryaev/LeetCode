package com.leetcode.array.medium;

public class SortTheStudentsByTheirKthScore {
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
     */
    public static int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length;i++){
            int index = i;
            for(int j = i+1; j < score.length;j++){
                if(score[j][k] > score[index][k]){
                    index = j;
                }
            }
            swapArray(score,index,i);
        }
        return score;
    }

    private static void swapArray(int[][] arr,int from,int to) {
        for(int i = 0;i<arr[0].length;i++){
            int temp = arr[from][i];
            arr[from][i] = arr[to][i];
            arr[to][i] = temp;
        }
    }
}
