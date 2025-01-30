package com.leetcode.bitmanipulation.medium;

public class FindTheOriginalArrayOfPrefixXor {
    /**
     * 2433. Find The Original Array of Prefix Xor
     * Medium
     * Topics
     * Companies
     * Hint
     * You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:
     * <p>
     * pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
     * Note that ^ denotes the bitwise-xor operation.
     * <p>
     * It can be proven that the answer is unique.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: pref = [5,2,0,3,1]
     * Output: [5,7,2,3,2]
     * Explanation: From the array [5,7,2,3,2] we have the following:
     * - pref[0] = 5.
     * - pref[1] = 5 ^ 7 = 2.
     * - pref[2] = 5 ^ 7 ^ 2 = 0.
     * - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
     * - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
     * Example 2:
     * <p>
     * Input: pref = [13]
     * Output: [13]
     * Explanation: We have pref[0] = arr[0] = 13.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= pref.length <= 105
     * 0 <= pref[i] <= 106
     */
    public static int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i-1]^pref[i];
        }
        return arr;
    }
}
