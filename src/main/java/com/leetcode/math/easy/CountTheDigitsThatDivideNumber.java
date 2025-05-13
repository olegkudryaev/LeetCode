package com.leetcode.math.easy;

import java.util.ArrayList;
import java.util.List;

public class CountTheDigitsThatDivideNumber {
    /**
     * 2520. Count the Digits That Divide a Number
     * Easy
     * Topics
     * Companies
     * Hint
     * Given an integer num, return the number of digits in num that divide num.
     *
     * An integer val divides nums if nums % val == 0.
     *
     *
     *
     * Example 1:
     *
     * Input: num = 7
     * Output: 1
     * Explanation: 7 divides itself, hence the answer is 1.
     * Example 2:
     *
     * Input: num = 121
     * Output: 2
     * Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
     * Example 3:
     *
     * Input: num = 1248
     * Output: 4
     * Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
     *
     *
     * Constraints:
     *
     * 1 <= num <= 109
     * num does not contain 0 as one of its digits.
     */

    public static int countDigits(int number) {
        if(number < 10){
            return 1;
        }
        List<Integer> digits = new ArrayList<>();
        int temp = number;
        while (temp > 0) {
            digits.add(0, temp % 10);
            temp /= 10;
        }
        int count = 0;
        for (int x : digits) {
            if (x != 0 && number % x == 0) {
                count++;
            }
        }
        return count;
    }
}
