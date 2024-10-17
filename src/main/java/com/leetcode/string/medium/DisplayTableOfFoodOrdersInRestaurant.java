package com.leetcode.string.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DisplayTableOfFoodOrdersInRestaurant {
    /**
     * 1418. Display Table of Food Orders in a Restaurant
     * Solved
     * Medium
     * Topics
     * Companies
     * Hint
     * Given the array orders, which represents the orders that customers have done in a restaurant. More specifically orders[i]=[customerNamei,tableNumberi,foodItemi] where customerNamei is the name of the customer, tableNumberi is the table customer sit at, and foodItemi is the item customer orders.
     *
     * Return the restaurant's “display table”. The “display table” is a table whose row entries denote how many of each food item each table ordered. The first column is the table number and the remaining columns correspond to each food item in alphabetical order. The first row should be a header whose first column is “Table”, followed by the names of the food items. Note that the customer names are not part of the table. Additionally, the rows should be sorted in numerically increasing order.
     *
     *
     *
     * Example 1:
     *
     * Input: orders = [["David","3","Ceviche"],["Corina","10","Beef Burrito"],["David","3","Fried Chicken"],["Carla","5","Water"],["Carla","5","Ceviche"],["Rous","3","Ceviche"]]
     * Output: [["Table","Beef Burrito","Ceviche","Fried Chicken","Water"],["3","0","2","1","0"],["5","0","1","0","1"],["10","1","0","0","0"]]
     * Explanation:
     * The displaying table looks like:
     * Table,Beef Burrito,Ceviche,Fried Chicken,Water
     * 3    ,0           ,2      ,1            ,0
     * 5    ,0           ,1      ,0            ,1
     * 10   ,1           ,0      ,0            ,0
     * For the table 3: David orders "Ceviche" and "Fried Chicken", and Rous orders "Ceviche".
     * For the table 5: Carla orders "Water" and "Ceviche".
     * For the table 10: Corina orders "Beef Burrito".
     * Example 2:
     *
     * Input: orders = [["James","12","Fried Chicken"],["Ratesh","12","Fried Chicken"],["Amadeus","12","Fried Chicken"],["Adam","1","Canadian Waffles"],["Brianna","1","Canadian Waffles"]]
     * Output: [["Table","Canadian Waffles","Fried Chicken"],["1","2","0"],["12","0","3"]]
     * Explanation:
     * For the table 1: Adam and Brianna order "Canadian Waffles".
     * For the table 12: James, Ratesh and Amadeus order "Fried Chicken".
     * Example 3:
     *
     * Input: orders = [["Laura","2","Bean Burrito"],["Jhon","2","Beef Burrito"],["Melissa","2","Soda"]]
     * Output: [["Table","Bean Burrito","Beef Burrito","Soda"],["2","1","1","1"]]
     *
     *
     * Constraints:
     *
     * 1 <= orders.length <= 5 * 10^4
     * orders[i].length == 3
     * 1 <= customerNamei.length, foodItemi.length <= 20
     * customerNamei and foodItemi consist of lowercase and uppercase English letters and the space character.
     * tableNumberi is a valid integer between 1 and 500.
     */
    public static List<List<String>> displayTable(List<List<String>> orders) {
        TreeMap<Integer, TreeMap<String, Integer>> mainMap = getMainMap(orders);
        List<String> firstTable = createFirstTable(mainMap);
        List<List<String>> result = new ArrayList<>();
        result.add(firstTable);
        List<List<String>> otherTables = createOtherTables(mainMap, firstTable);
        if (otherTables != null) {
            result.addAll(otherTables);
        }
        return result;
    }

    private static List<String> createFirstTable(TreeMap<Integer, TreeMap<String, Integer>> mainMap) {
        List<String> firstTable = new ArrayList<>();
        firstTable.add("Table");
        Set<Integer> tables = mainMap.keySet();
        TreeSet<String> sortedFood = new TreeSet<>();
        for (Integer table : tables) {
            Set<String> food = mainMap.get(table).keySet();
            sortedFood.addAll(food);
        }
        firstTable.addAll(sortedFood);
        return firstTable;
    }

    private static TreeMap<Integer, TreeMap<String, Integer>> getMainMap(List<List<String>> orders) {
        TreeMap<Integer, TreeMap<String, Integer>> mainMap = new TreeMap<>();
        for (int i = 0; i < orders.size(); i++) {
            Integer table = Integer.valueOf(orders.get(i).get(1));
            String food = orders.get(i).get(2);
            if (mainMap.containsKey(table)) {
                TreeMap<String, Integer> foodAndCountMap = mainMap.get(table);
                foodAndCountMap.put(food, foodAndCountMap.getOrDefault(food, 0) + 1);
                mainMap.put(table, foodAndCountMap);
            } else {
                TreeMap<String, Integer> foodMap = new TreeMap<>();
                foodMap.put(food, 1);
                mainMap.put(table, foodMap);
            }
        }
        return mainMap;
    }

    private static List<List<String>> createOtherTables(TreeMap<Integer, TreeMap<String, Integer>> mainMap,
                                                        List<String> firstTable) {
        List<List<String>> result = new ArrayList<>();
        for (Integer string : mainMap.keySet()) {
            List<String> table = new ArrayList<>();
            table.add(string.toString());
            for (int i = 1; i < firstTable.size(); i++) {
                if (mainMap.get(string).containsKey(firstTable.get(i))) {
                    Integer integer = mainMap.get(string).get(firstTable.get(i));
                    table.add(integer.toString());
                } else {
                    table.add("0");
                }
            }
            result.add(table);
        }
        return result;
    }
}
