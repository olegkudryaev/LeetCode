package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EncodeAndDecodeTinyURLTest {
    @Test
    void test() {
        String url = "https://leetcode.com/problems/design-tinyurl";
        String exp = "https://leetcode.com/problems/design-tinyurl";

        String test = EncodeAndDecodeTinyURL.decode(EncodeAndDecodeTinyURL.encode(url));

        Assertions.assertEquals(test, exp);
    }
}