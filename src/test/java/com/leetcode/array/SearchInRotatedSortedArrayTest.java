package com.leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class SearchInRotatedSortedArrayTest {

    @InjectMocks
    private SearchInRotatedSortedArray searchInRotatedSortedArray;

    @Test
    void test1() {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 5;
        int search = searchInRotatedSortedArray.search(nums, target);

        Assertions.assertEquals(4, search);
    }
    @Test
    void test2() {
        int[] nums = {5,6,7,1,2,3,4};
        int target = 7;
        int search = searchInRotatedSortedArray.search(nums, target);

        Assertions.assertEquals(2, search);
    }
    @Test
    void test3() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int search = searchInRotatedSortedArray.search(nums, target);

        Assertions.assertEquals(4, search);
    }


}
