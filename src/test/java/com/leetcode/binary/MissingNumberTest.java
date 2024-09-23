package com.leetcode.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class MissingNumberTest {

    @InjectMocks
    private MissingNumber missingNumber;

    @Test
    void test1() {
        int[] nums = {9,6,4,2,3,5,7,0,1};

        int num = MissingNumber.missingNumber(nums);

        Assertions.assertEquals(8, num);

        int[] nums2 = {0,1};

        int num2 = MissingNumber.missingNumber(nums2);

        Assertions.assertEquals(2, num2);
    }

}
