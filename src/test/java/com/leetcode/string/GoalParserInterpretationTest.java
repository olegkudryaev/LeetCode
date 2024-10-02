package com.leetcode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GoalParserInterpretationTest {
    @Test
    void test1() {
        String command = "G()(al)";

        String interpret = GoalParserInterpretation.interpret(command);

        Assertions.assertEquals("Goal", interpret);
    }
}
