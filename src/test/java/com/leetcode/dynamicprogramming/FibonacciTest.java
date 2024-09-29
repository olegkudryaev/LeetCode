package com.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void test1() {
        long fibonacci = Fibonacci.fibonacci(10);
        Assertions.assertEquals(55, fibonacci);
    }
}
