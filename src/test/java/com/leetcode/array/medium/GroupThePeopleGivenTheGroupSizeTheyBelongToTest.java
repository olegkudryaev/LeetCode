package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GroupThePeopleGivenTheGroupSizeTheyBelongToTest {
    @Test
    void test(){
        int[] nums = {3,3,3,3,3,1,3};
        List<List<Integer>> exp = new ArrayList<>();
        // Заполняем данными
        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(1);
        list2.add(2);
        exp.add(list2);
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        exp.add(list1);
        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(4);
        list3.add(6);
        exp.add(list3);
        List<List<Integer>> lists = GroupThePeopleGivenTheGroupSizeTheyBelongTo.groupThePeople(nums);

        for (int i = 0; i < exp.size(); i++) {
            for (int j = 0; j < exp.get(i).size(); j++) {
                Assertions.assertEquals(exp.get(i).get(j), lists.get(i).get(j));
            }
        }
    }
}
