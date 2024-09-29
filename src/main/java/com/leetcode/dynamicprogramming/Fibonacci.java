package com.leetcode.dynamicprogramming;

import java.util.HashMap;

public class Fibonacci {

    private static HashMap<Integer, Long> cache = new HashMap<>();

    public static long fibonacci(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        if (n <= 1) {
            return n;
        }
        long result = fibonacci(n - 1) + fibonacci(n - 2);
        cache.put(n, result);
        return result;
    }
}
