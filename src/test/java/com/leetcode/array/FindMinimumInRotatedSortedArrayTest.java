package com.leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class FindMinimumInRotatedSortedArrayTest {
    @InjectMocks
    private FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray;

    @Test
    void findMinWithOneNumber() {
        int[] nums = {4};
        int result = findMinimumInRotatedSortedArray.findMin(nums);
        Assertions.assertEquals(nums[0], result);
    }

    @Test
    void findMinWithSeveralNumbers() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = findMinimumInRotatedSortedArray.findMin(nums);
        Assertions.assertEquals(nums[4], result);
    }

    @Test
    void findMinWithSeveralNumbers2() {
        int[] nums = {4,5,6,7,8,9,0,1,2};
        int result = findMinimumInRotatedSortedArray.findMin(nums);
        Assertions.assertEquals(nums[6], result);
    }
}
