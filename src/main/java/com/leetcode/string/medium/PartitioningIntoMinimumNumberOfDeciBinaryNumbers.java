package com.leetcode.string.medium;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    /**
     * 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
     * Середина
     * Темы
     * Компании
     * Намекать
     * Десятичное число называется деци-бинарным, если каждая из его цифр является либо без лидирующих нулей 0, либо 1без них. Например, 101и 1100являются деци-бинарными , тогда как 112и 3001— нет.
     * <p>
     * Для данной строки n, представляющей положительное десятичное целое число, вернуть минимальное количество положительных деци-двоичных чисел, необходимое для того, чтобы их сумма дала n.
     * <p>
     * <p>
     * <p>
     * Пример 1:
     * <p>
     * Вход: n = "32"
     * Выход: 3
     * Объяснение: 10 + 11 + 11 = 32
     * Пример 2:
     * <p>
     * Вход: n = "82734"
     * Выход: 8
     * Пример 3:
     * <p>
     * Вход: n = "27346209830709182346"
     * Выход: 9
     * <p>
     * <p>
     * Ограничения:
     * <p>
     * 1 <= n.length <= 105
     * nсостоит только из цифр.
     * nне содержит начальных нулей и представляет собой положительное целое число.
     */
    public static int minPartitions(String n) {
        int result = 0;
        char[] charArray = n.toCharArray();
        for (int num : charArray) {
            if (num > result) {
                result = num;
            }
        }
        int numericValue = Character.getNumericValue(result);
        return numericValue;
    }
}
