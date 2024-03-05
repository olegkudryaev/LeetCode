package com.leetcode.easy;

public class NumberOfStepsToReduceNumberToZero {

    /**
     * Given an integer num, return the number of steps to reduce it to zero.
     * <p>
     * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: num = 14
     * Output: 6
     * Explanation:
     * Step 1) 14 is even; divide by 2 and obtain 7.
     * Step 2) 7 is odd; subtract 1 and obtain 6.
     * Step 3) 6 is even; divide by 2 and obtain 3.
     * Step 4) 3 is odd; subtract 1 and obtain 2.
     * Step 5) 2 is even; divide by 2 and obtain 1.
     * Step 6) 1 is odd; subtract 1 and obtain 0.
     * Example 2:
     * <p>
     * Input: num = 8
     * Output: 4
     * Explanation:
     * Step 1) 8 is even; divide by 2 and obtain 4.
     * Step 2) 4 is even; divide by 2 and obtain 2.
     * Step 3) 2 is even; divide by 2 and obtain 1.
     * Step 4) 1 is odd; subtract 1 and obtain 0.
     * Example 3:
     * <p>
     * Input: num = 123
     * Output: 12
     */

    public static void main(String[] args) {
        int i = numberOfSteps(14);
        System.out.println(i);
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                steps++;
                num /= 2;
            }
            if (num % 2 != 0) {
                steps++;
                num --;
            }
        }
        return steps;
    }
}
