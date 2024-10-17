package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DisplayTableOfFoodOrdersInRestaurantTest {

    @Test
    void test1() {
        List<String> order1 = List.of("David", "3", "Ceviche");
        List<String> order2 = List.of("Corina", "10", "Beef Burrito");
        List<String> order3 = List.of("David", "3", "Fried Chicken");
        List<String> order4 = List.of("Carla", "5", "Water");
        List<String> order5 = List.of("Carla", "5", "Ceviche");
        List<String> order6 = List.of("Rous", "3", "Ceviche");

        List<List<String>> orders = List.of(order1, order2, order3, order4, order5, order6);

        List<String> order11 = List.of("Table","Beef Burrito","Ceviche","Fried Chicken","Water");
        List<String> order12 = List.of("3","0","2","1","0");
        List<String> order13 = List.of("5","0","1","0","1");
        List<String> order14 = List.of("10","1","0","0","0");

        List<List<String>> expect = List.of(order11, order12, order13, order14);

        List<List<String>> result = DisplayTableOfFoodOrdersInRestaurant.displayTable(orders);

        Assertions.assertEquals(expect, result);
    }

    @Test
    void test2() {
        List<String> order1 = List.of("James","12","Fried Chicken");
        List<String> order2 = List.of("Ratesh","12","Fried Chicken");
        List<String> order3 = List.of("Amadeus","12","Fried Chicken");
        List<String> order4 = List.of("Adam","1","Canadian Waffles");
        List<String> order5 = List.of("Brianna","1","Canadian Waffles");

        List<List<String>> orders = List.of(order1, order2, order3, order4, order5);

        List<String> order11 = List.of("Table","Canadian Waffles","Fried Chicken");
        List<String> order12 = List.of("1","2","0");
        List<String> order13 = List.of("12","0","3");

        List<List<String>> expect = List.of(order11, order12, order13);

        List<List<String>> result = DisplayTableOfFoodOrdersInRestaurant.displayTable(orders);

        Assertions.assertEquals(expect, result);
    }
}
