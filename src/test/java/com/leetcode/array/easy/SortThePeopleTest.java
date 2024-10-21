package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortThePeopleTest {

    @Test
    void test1(){
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        String[] expect = {"Mary","Emma","John"};

        String[] strings = SortThePeople.sortPeople(names, heights);

        for (int i = 0; i < strings.length; i++) {
            Assertions.assertEquals(expect[i], strings[i]);
        }
    }

    @Test
    void test2(){
        String[] names = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int[] heights = {17233,32521,14087,42738,46669,65662,43204,8224};

        String[] expect = {"EPCFFt","RPJOFYZUBFSIYp","VOYGWWNCf","Vk","Sgizfdfrims","IEO","QTASHKQ","WSpmqvb"};

        String[] strings = SortThePeople.sortPeople(names, heights);

        for (int i = 0; i < strings.length; i++) {
            Assertions.assertEquals(expect[i], strings[i]);
        }
    }
}
