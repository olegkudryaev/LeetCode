package com.leetcode.bitmanipulation.medium;

import java.util.HashMap;

public class FindThePrefixCommonArrayOfTwoArrays {
    /**
     * Code
     * Testcase
     * Test Result
     * Test Result
     * 2657. Find the Prefix Common Array of Two Arrays
     * Medium
     * Topics
     * Companies
     * Hint
     * You are given two 0-indexed integer permutations A and B of length n.
     * <p>
     * A prefix common array of A and B is an array C such that C[i] is equal to the count of numbers that are present at or before the index i in both A and B.
     * <p>
     * Return the prefix common array of A and B.
     * <p>
     * A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: A = [1,3,2,4], B = [3,1,2,4]
     * Output: [0,2,3,4]
     * Explanation: At i = 0: no number is common, so C[0] = 0.
     * At i = 1: 1 and 3 are common in A and B, so C[1] = 2.
     * At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
     * At i = 3: 1, 2, 3, and 4 are common in A and B, so C[3] = 4.
     * Example 2:
     * <p>
     * Input: A = [2,3,1], B = [3,1,2]
     * Output: [0,1,3]
     * Explanation: At i = 0: no number is common, so C[0] = 0.
     * At i = 1: only 3 is common in A and B, so C[1] = 1.
     * At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= A.length == B.length == n <= 50
     * 1 <= A[i], B[i] <= n
     * It is guaranteed that A and B are both a permutation of n integers.
     */
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (map.get(A[i]) == null) {
                map.put(A[i], 1);
            } else {
                map.put(A[i], map.get(A[i]) + 1);
                result[i] += 1;
            }
            if (map.get(B[i]) == null) {
                map.put(B[i], 1);
            } else {
                map.put(B[i], map.get(B[i]) + 1);
                result[i] += 1;
            }
            if (i > 0) {
                result[i] += result[i - 1];
            }
        }

        return result;
    }

//    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
//
//        int n = A.length;
//        boolean[] visitedA = new boolean[n+1];
//        boolean[] visitedB = new boolean[n+1];
//
//        int[] soln = new int[n];
//        int count = 0;
//
//        for(int i=0; i<n; i++) {
//            visitedA[A[i]] = true;
//            visitedB[B[i]] = true;
//            if(A[i] == B[i]) {
//                count++;
//            } else {
//                if(visitedA[A[i]] == true  && visitedB[A[i]] == true) count++;
//                if(visitedA[B[i]] == true  && visitedB[B[i]] == true) count++;
//            }
//            soln[i] = count;
//        }
//        return soln;
//
//    }
}
