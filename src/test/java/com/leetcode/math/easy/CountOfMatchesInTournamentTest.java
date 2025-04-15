package com.leetcode.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountOfMatchesInTournamentTest {
    @Test
    void test(){
        int n = 7;
        int exp = 6;

        int i = CountOfMatchesInTournament.numberOfMatches(n);

        Assertions.assertEquals(exp, i);
    }
}
