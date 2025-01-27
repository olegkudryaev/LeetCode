package com.leetcode.array.medium;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    /**
     * 1769. Minimum Number of Operations to Move All Balls to Each Box
     * Medium
     * Topics
     * Companies
     * Hint
     * You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.
     * <p>
     * In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may be more than one ball in some boxes.
     * <p>
     * Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.
     * <p>
     * Each answer[i] is calculated considering the initial state of the boxes.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: boxes = "110"
     * Output: [1,1,3]
     * Explanation: The answer for each box is as follows:
     * 1) First box: you will have to move one ball from the second box to the first box in one operation.
     * 2) Second box: you will have to move one ball from the first box to the second box in one operation.
     * 3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation.
     * Example 2:
     * <p>
     * Input: boxes = "001011"
     * Output: [11,8,5,4,3,4]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == boxes.length
     * 1 <= n <= 2000
     * boxes[i] is either '0' or '1'.
     */
    public static int[] minOperations(String boxes) {
        int lengthN = boxes.length();

        char[] charArray = boxes.toCharArray();
        int[] result = new int[charArray.length];

        for (int i = 0; i < result.length; i++) {
            int count = 0;
            for (int j = 0; j < charArray.length; j++) {
                if(i == j){
                    continue;
                }
                if(i < j && charArray[j] != '0'){
                    count += j - i;
                }
                if(i > j && charArray[j] != '0'){
                    count += i - j;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
