package com.leetcode.binary;

public class NumberOfOneBits {

    /**
     * 191. Number of 1 Bits
     * Easy
     * Topics
     * Companies
     * Write a function that takes the binary representation of a positive integer and returns the number of
     * set bits
     * it has (also known as the Hamming weight).
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 11
     * <p>
     * Output: 3
     * <p>
     * Explanation:
     * <p>
     * The input binary string 1011 has a total of three set bits.
     * <p>
     * Example 2:
     * <p>
     * Input: n = 128
     * <p>
     * Output: 1
     * <p>
     * Explanation:
     * <p>
     * The input binary string 10000000 has a total of one set bit.
     * <p>
     * Example 3:
     * <p>
     * Input: n = 2147483645
     * <p>
     * Output: 30
     * <p>
     * Explanation:
     * <p>
     * The input binary string 1111111111111111111111111111101 has a total of thirty set bits.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= n <= 231 - 1
     * <p>
     * <p>
     * Follow up: If this function is called many times, how would you optimize it?
     */

//    public static int hammingWeight(int n) {
//        Integer result = n;
//        int i = Integer.bitCount(result);
//        return i;
//    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n = n >> 1;
        }
        return count;
    }
    /**
     * 16/2 = 8 = 0
     * 8/2 = 4 = 0
     * 4/2 = 2 = 0
     * 2/2 = 1 = 0
     * 1/2 = 0 = 1
     */

}
